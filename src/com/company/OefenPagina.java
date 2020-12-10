package com.company;

public class OefenPagina {
    public static void main(String[] args) {

        calcScore(true, 800, 5, 100);
        calcScore(true, 5800, 127, 1080);
    }

    public static void calcScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score = " + finalScore);
        }
    }


}
