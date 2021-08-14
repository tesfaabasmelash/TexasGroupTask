package com.javaproject;

public class MarksTester {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(75,80,92);
        studentA.getPercentage();
        StudentB studentB = new StudentB(100,92,76,88);
        studentB.getPercentage();

    }
}
