package com.company;


import java.util.List;
import java.util.ArrayList;


public class OefenPagina {
    public static void main(String[] args) {

    Integer[] henkie = new Integer[] {1, 300, 12, 200 };
    
    List<Integer> pietje = new ArrayList<>();
    pietje.add(1);
    pietje.add(1000);
    pietje.add(12);
    pietje.add(100);

    Integer[] sjoerd = addPlayer( 1, 20000, 5, 250);
    
    calcScore(henkie[0], henkie[1], henkie[2], henkie[3]);
    calcScore(pietje.get(0), pietje.get(1), pietje.get(2), pietje.get(3));
    calcScore(sjoerd[0], sjoerd[1], sjoerd[2], sjoerd[3] );

        for (int i = 0; i < sjoerd.length; i++) {
            System.out.println(sjoerd[i]);
        }
        System.out.println("lalala");

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
