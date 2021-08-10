package com.example.konnekt2;

public class UserScore {
    static int score=0;


    public static void incrementScore(int score) {
        UserScore.score = score+1;
    }

    public static void resetScore(int score) {
        UserScore.score = 0;
    }
}
