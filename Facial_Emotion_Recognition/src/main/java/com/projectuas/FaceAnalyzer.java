package com.projectuas;

import java.util.Random;

public class FaceAnalyzer {
    private static final String[] EXPRESSIONS = {"Happy", "Sad", "Neutral", "Confusion"};

    public String analyzeFace(String imagePath) {
        // Simulasi analisis ekspresi wajah
        Random random = new Random();
        return EXPRESSIONS[random.nextInt(EXPRESSIONS.length)];
    }
}