package com.company;

public class highScores {
    public static void main(String[] args) {

        int position = calcHighScorePos(1200);
        System.out.println(displayHighScorePosition("Sjoerd",position));
    }

    public static String displayHighScorePosition (String userName, int pos) {
        return userName + "managed to get into position: " + pos + " on the Highscore table";

    }

    public static int calcHighScorePos (int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
