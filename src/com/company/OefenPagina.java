package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class OefenPagina {
    public static void main(String[] args) {

    HashMap<String, Integer> playerPietje = new HashMap<>();
        playerPietje.put("gameOver", 1);
        playerPietje.put("score", 1000);
        playerPietje.put("levelCompleted", 12);
        playerPietje.put("bonus", 100);

        int finalScorePietje = playerPietje.get("score");
        System.out.println(finalScorePietje);



        calcScore(1, 800, 5, 100);
        calcScore(1, 5800, 127, 1080);

    }

    public static void calcScore (int gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == 1) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score = " + finalScore);
        }
    }


}
