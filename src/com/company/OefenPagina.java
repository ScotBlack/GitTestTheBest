package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class OefenPagina {
    public static void main(String[] args) {

    Integer[] henkie = new Integer[] {1, 300, 12, 200 };
    System.out.println(henkie[1]);
        
    
    List<Integer> playerPietje = new ArrayList<>();
    playerPietje.add(1);
    playerPietje.add(1000);
    playerPietje.add(12);
    playerPietje.add(100);
    System.out.println(playerPietje);
    calcScore(playerPietje.get(0), playerPietje.get(1), playerPietje.get(2), playerPietje.get(3));
    
    Integer[] sjoerd = addPlayer( 1, 20000, 5, 250);
    

    calcScore(1, 800, 5, 100);
    calcScore(1, 5800, 127, 1080);

        

        for (int i = 0; i < sjoerd.length; i++) {
            System.out.println(sjoerd[i]);
        }
        calcScore(sjoerd[0], sjoerd[1], sjoerd[2], sjoerd[3] );

    }


    public static void calcScore (int gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == 1) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score = " + finalScore);
        }
    }



    public static Integer[] addPlayer (int gameOver, int score, int levelCompleted, int bonus) {
       return new Integer[] {gameOver, score, levelCompleted, bonus};
    }




    Integer[] henkie = new Integer[] {1, 300, 12, 200 };



}
