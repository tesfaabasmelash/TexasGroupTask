package com.javaproject;

public class MarksTester {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(100,92,88);
        studentA.getPercentage();
        StudentB studentB = new StudentB(75,80,92,100);
        studentB.getPercentage();

    }
}
