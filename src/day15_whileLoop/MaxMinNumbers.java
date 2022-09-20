package day15_whileLoop;

import java.util.Scanner;

public class MaxMinNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;
        int min = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if(num<min){
                min = num;
            }

            if(num>max){
                max = num;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
