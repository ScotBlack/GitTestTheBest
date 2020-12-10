package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class OefenPagina {
    public static void main(String[] args) {

    List<Integer> playerPietje = new ArrayList<>();
        playerPietje.add(1);
        playerPietje.add(1000);
        playerPietje.add(12);
        playerPietje.add(100);

        System.out.println(playerPietje);
//        int finalScorePietje = calcScore(playerPietje);
//        System.out.println(finalScorePietje);

        calcScore(playerPietje.get(0), playerPietje.get(1), playerPietje.get(2), playerPietje.get(3));


        calcScore(1, 800, 5, 100);
        calcScore(1, 5800, 127, 1080);
    // test for git
    }

    public static void calcScore (int gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == 1) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score = " + finalScore);
        }
    }
}
