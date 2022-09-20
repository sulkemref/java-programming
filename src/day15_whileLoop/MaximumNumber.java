package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648; //-25,

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();//-25,35,15,40,0

            if(num>max){
                max = num;
            }
        }
        System.out.println("max = " + max);

        input.close();
    }
}

/*
1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number
 */