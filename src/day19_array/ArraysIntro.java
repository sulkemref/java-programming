package day19_array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;

        System.out.println("-----------------------------------------------");

        int[] score = new int[5];//index: 0~4
        score[2]= 78;
        score[0]= 85;
        score[1]= 75;
        score[3]= 88;
        score[4]= 95;
       // score[2]= 100;

       //  score = new int[10]; //index 0 ~ 9

       // score = new int[50]; // index 0 ~ 49

       System.out.println(Arrays.toString(score));

        System.out.println(score[2]);

        System.out.println("------------------------------------------------");

        for (int i = 0; i < score.length; i++) {// i: index numbers of scores array
            System.out.println(score[i]);
        }

        System.out.println("------------------------------------------------");

        System.out.println(score[score.length-1]);

        System.out.println("------------------------------------------------");




    }
}
