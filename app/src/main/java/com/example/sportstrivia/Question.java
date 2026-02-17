package com.example.sportstrivia;

public class Question {
    private String category;
    private String questionText;
    private String[] answers;
    private int correctAnswerIndex;

    public Question(String category, String questionText, String[] answers, int correctAnswerIndex) {
        this.category = category;
        this.questionText = questionText;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getCategory() {
        return category;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public boolean isCorrect(int selectedIndex) {
        return selectedIndex == correctAnswerIndex;
    }
}
