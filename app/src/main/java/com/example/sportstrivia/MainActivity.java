package com.example.sportstrivia;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainActivity extends Activity implements View.OnClickListener {

    private static final String PREFS_NAME = "SportsTriviaPrefs";
    private static final String FLAGGED_KEY = "flagged_questions";

    private TextView scoreText;
    private TextView categoryText;
    private TextView questionNumber;
    private TextView questionText;
    private TextView resultText;
    private Button answerA, answerB, answerC, answerD;
    private Button nextButton;
    private Button newGameButton;
    private Button flagButton;
    private Button[] answerButtons;

    private QuestionBank questionBank;
    private List<Question> questions;
    private int currentQuestionIndex = 0;
    private int score = 0;
    private boolean answered = false;
    private boolean flagConfirmPending = false;

    private SharedPreferences prefs;
    private Set<String> flaggedQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        flaggedQuestions = new HashSet<>(prefs.getStringSet(FLAGGED_KEY, new HashSet<String>()));

        scoreText = findViewById(R.id.scoreText);
        categoryText = findViewById(R.id.categoryText);
        questionNumber = findViewById(R.id.questionNumber);
        questionText = findViewById(R.id.questionText);
        resultText = findViewById(R.id.resultText);
        answerA = findViewById(R.id.answerA);
        answerB = findViewById(R.id.answerB);
        answerC = findViewById(R.id.answerC);
        answerD = findViewById(R.id.answerD);
        nextButton = findViewById(R.id.nextButton);
        newGameButton = findViewById(R.id.newGameButton);
        flagButton = findViewById(R.id.flagButton);

        answerButtons = new Button[]{answerA, answerB, answerC, answerD};

        for (Button btn : answerButtons) {
            btn.setOnClickListener(this);
        }
        nextButton.setOnClickListener(this);
        newGameButton.setOnClickListener(this);
        flagButton.setOnClickListener(this);

        startNewGame();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.flagButton) {
            handleFlagClick();
            return;
        }

        if (id == R.id.nextButton) {
            currentQuestionIndex++;
            if (currentQuestionIndex < questions.size()) {
                showQuestion();
            } else {
                showGameOver();
            }
            return;
        }

        if (id == R.id.newGameButton) {
            startNewGame();
            return;
        }

        // Answer buttons
        if (!answered) {
            int selectedIndex = -1;
            for (int i = 0; i < answerButtons.length; i++) {
                if (v == answerButtons[i]) {
                    selectedIndex = i;
                    break;
                }
            }
            if (selectedIndex >= 0) {
                handleAnswer(selectedIndex);
            }
        }
    }

    private void handleFlagClick() {
        if (!flagConfirmPending) {
            // First tap: switch to confirmation state
            flagConfirmPending = true;
            flagButton.setText("Confirm?");
            flagButton.setBackgroundColor(getResources().getColor(R.color.flag_confirm));
        } else {
            // Second tap: confirmed — flag and remove this question
            flagConfirmPending = false;
            Question q = questions.get(currentQuestionIndex);
            flaggedQuestions.add(q.getQuestionText());
            saveFlaggedQuestions();

            // Remove from current game list
            questions.remove(currentQuestionIndex);

            if (questions.isEmpty()) {
                showGameOver();
            } else {
                // If we removed the last question, back up the index
                if (currentQuestionIndex >= questions.size()) {
                    currentQuestionIndex = questions.size() - 1;
                }
                showQuestion();
            }
        }
    }

    private void saveFlaggedQuestions() {
        prefs.edit().putStringSet(FLAGGED_KEY, new HashSet<>(flaggedQuestions)).apply();
    }

    private void startNewGame() {
        questionBank = new QuestionBank();
        questions = questionBank.getShuffledQuestions(flaggedQuestions);
        currentQuestionIndex = 0;
        score = 0;

        if (questions.isEmpty()) {
            questionNumber.setText("No Questions Available");
            questionText.setText("All questions have been flagged. Reinstall to reset.");
            categoryText.setVisibility(View.GONE);
            for (Button btn : answerButtons) {
                btn.setVisibility(View.GONE);
            }
            flagButton.setVisibility(View.GONE);
            nextButton.setVisibility(View.GONE);
            newGameButton.setVisibility(View.VISIBLE);
            return;
        }

        categoryText.setVisibility(View.VISIBLE);
        for (Button btn : answerButtons) {
            btn.setVisibility(View.VISIBLE);
        }
        flagButton.setVisibility(View.VISIBLE);
        newGameButton.setVisibility(View.VISIBLE);

        updateScore();
        showQuestion();
    }

    private void showQuestion() {
        answered = false;
        flagConfirmPending = false;
        flagButton.setText("Flag");
        flagButton.setBackgroundColor(getResources().getColor(R.color.flag_button));
        flagButton.setVisibility(View.VISIBLE);

        Question q = questions.get(currentQuestionIndex);

        categoryText.setText(q.getCategory());
        if ("Baseball".equals(q.getCategory())) {
            categoryText.setBackgroundColor(getResources().getColor(R.color.baseball_accent));
        } else {
            categoryText.setBackgroundColor(getResources().getColor(R.color.football_accent));
        }

        questionNumber.setText("Question " + (currentQuestionIndex + 1) + " of " + questions.size());
        questionText.setText(q.getQuestionText());

        String[] answers = q.getAnswers();
        String[] labels = {"A", "B", "C", "D"};
        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i].setText(labels[i] + ".  " + answers[i]);
            answerButtons[i].setBackgroundColor(getResources().getColor(R.color.default_button));
            answerButtons[i].setTextColor(getResources().getColor(R.color.default_button_text));
            answerButtons[i].setEnabled(true);
            answerButtons[i].setVisibility(View.VISIBLE);
        }

        resultText.setVisibility(View.GONE);
        nextButton.setVisibility(View.GONE);
    }

    private void handleAnswer(int selectedIndex) {
        answered = true;
        Question q = questions.get(currentQuestionIndex);
        boolean correct = q.isCorrect(selectedIndex);

        if (correct) {
            score++;
            resultText.setText("Correct!");
            resultText.setTextColor(getResources().getColor(R.color.correct_green));
            answerButtons[selectedIndex].setBackgroundColor(getResources().getColor(R.color.correct_green));
        } else {
            score--;
            resultText.setText("Wrong! The answer is: " + q.getAnswers()[q.getCorrectAnswerIndex()]);
            resultText.setTextColor(getResources().getColor(R.color.wrong_red));
            answerButtons[selectedIndex].setBackgroundColor(getResources().getColor(R.color.wrong_red));
            answerButtons[q.getCorrectAnswerIndex()].setBackgroundColor(getResources().getColor(R.color.correct_green));
        }

        resultText.setVisibility(View.VISIBLE);
        updateScore();

        for (Button btn : answerButtons) {
            btn.setEnabled(false);
        }

        if (currentQuestionIndex < questions.size() - 1) {
            nextButton.setText("Next Question");
        } else {
            nextButton.setText("See Results");
        }
        nextButton.setVisibility(View.VISIBLE);
    }

    private void showGameOver() {
        questionNumber.setText("Game Over!");
        questionText.setText("Final Score: " + score + " out of " + questions.size() + "\n\n"
                + getPerformanceMessage());
        categoryText.setVisibility(View.GONE);

        for (Button btn : answerButtons) {
            btn.setVisibility(View.GONE);
        }

        flagButton.setVisibility(View.GONE);
        resultText.setVisibility(View.GONE);
        nextButton.setVisibility(View.GONE);
        newGameButton.setVisibility(View.VISIBLE);
    }

    private String getPerformanceMessage() {
        if (questions.isEmpty()) return "No questions were answered.";
        double percentage = (double) score / questions.size() * 100;
        if (percentage >= 90) return "Outstanding! You're a true sports expert!";
        if (percentage >= 70) return "Great job! You really know your sports!";
        if (percentage >= 50) return "Not bad! Keep studying those stats!";
        if (percentage >= 30) return "Room for improvement. Keep at it!";
        return "Time to hit the books! Better luck next time!";
    }

    private void updateScore() {
        scoreText.setText(String.valueOf(score));
        if (score > 0) {
            scoreText.setTextColor(getResources().getColor(R.color.score_positive));
        } else if (score < 0) {
            scoreText.setTextColor(getResources().getColor(R.color.score_negative));
        } else {
            scoreText.setTextColor(getResources().getColor(R.color.score_zero));
        }
    }
}
