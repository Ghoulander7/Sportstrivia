package com.example.sportstrivia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Question {
    private String category;
    private String questionText;
    private String[] answers;
    private int correctAnswerIndex;
    private boolean shuffled = false;

    private static final Random random = new Random();

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
        if (!shuffled) {
            shuffleAnswers();
        }
        return answers;
    }

    public int getCorrectAnswerIndex() {
        if (!shuffled) {
            shuffleAnswers();
        }
        return correctAnswerIndex;
    }

    public boolean isCorrect(int selectedIndex) {
        return selectedIndex == getCorrectAnswerIndex();
    }

    private void shuffleAnswers() {
        shuffled = true;
        String correctAnswer = answers[correctAnswerIndex];

        if (isNumeric(correctAnswer)) {
            generateNumericChoices(correctAnswer);
        } else {
            shuffleExistingAnswers(correctAnswer);
        }
    }

    private void generateNumericChoices(String correctAnswer) {
        double correctVal = parseNumber(correctAnswer);
        boolean hasComma = correctAnswer.contains(",");
        boolean hasPercent = correctAnswer.contains("%");
        boolean hasDecimal = correctAnswer.replace("%", "").contains(".");
        int decimalPlaces = 0;
        if (hasDecimal) {
            String clean = correctAnswer.replace("%", "").replace(",", "");
            decimalPlaces = clean.length() - clean.indexOf('.') - 1;
        }

        double range = Math.abs(correctVal) * 0.10;
        if (range < 1) range = 1;

        List<String> choices = new ArrayList<>();
        choices.add(correctAnswer);

        int attempts = 0;
        while (choices.size() < 4 && attempts < 200) {
            attempts++;
            double offset = (random.nextDouble() * 2 - 1) * range;
            // Don't generate values too close to correct
            if (Math.abs(offset) < range * 0.15) continue;

            double newVal = correctVal + offset;
            if (newVal < 0 && correctVal > 0) continue;

            String formatted = formatNumber(newVal, hasComma, hasPercent, hasDecimal, decimalPlaces);
            if (!choices.contains(formatted)) {
                choices.add(formatted);
            }
        }

        // Fallback if we somehow couldn't generate enough
        while (choices.size() < 4) {
            double fallback = correctVal + (choices.size() * range * 0.3);
            String formatted = formatNumber(fallback, hasComma, hasPercent, hasDecimal, decimalPlaces);
            if (!choices.contains(formatted)) {
                choices.add(formatted);
            } else {
                choices.add(formatNumber(fallback + 1, hasComma, hasPercent, hasDecimal, decimalPlaces));
            }
        }

        Collections.shuffle(choices, random);
        correctAnswerIndex = choices.indexOf(correctAnswer);
        answers = choices.toArray(new String[0]);
    }

    private void shuffleExistingAnswers(String correctAnswer) {
        List<String> choiceList = new ArrayList<>();
        for (String a : answers) {
            choiceList.add(a);
        }
        Collections.shuffle(choiceList, random);
        correctAnswerIndex = choiceList.indexOf(correctAnswer);
        answers = choiceList.toArray(new String[0]);
    }

    private boolean isNumeric(String s) {
        String clean = s.replace(",", "").replace("%", "").trim();
        if (clean.isEmpty()) return false;
        try {
            Double.parseDouble(clean);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private double parseNumber(String s) {
        return Double.parseDouble(s.replace(",", "").replace("%", "").trim());
    }

    private String formatNumber(double val, boolean comma, boolean percent, boolean decimal, int decPlaces) {
        String result;
        if (decimal) {
            result = String.format("%." + decPlaces + "f", val);
        } else {
            result = String.valueOf((int) Math.round(val));
        }

        if (comma && !decimal) {
            long intVal = Math.round(val);
            result = String.format("%,d", intVal);
        } else if (comma) {
            String[] parts = result.split("\\.");
            long intPart = Long.parseLong(parts[0]);
            result = String.format("%,d", intPart) + "." + parts[1];
        }

        if (percent) {
            result += "%";
        }
        return result;
    }
}
