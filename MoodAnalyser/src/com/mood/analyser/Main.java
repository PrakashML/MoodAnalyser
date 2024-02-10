package com.mood.analyser;

public class Main {
    public static void main(String[] args) {
        MoodAnalyser m1 = new MoodAnalyser("I am in not happy Mood");
        MoodAnalyser m2 = new MoodAnalyser("I am in happy Mood");
        System.out.println(m1.analyseMood());
        System.out.println(m2.analyseMood());
    }
}
