package day09_scaner;

//import java.util.*;          //wild import

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");

        byte num1 = input.nextByte();

        System.out.println("Enter your second number: ");

        short num2 = input.nextShort();

        System.out.println("Enter your third number: ");

        int num3 = input.nextInt();

        System.out.println("Enter your fourth number: ");

        int num4 = (int)input.nextLong();// implicit casting

        input.close(); //scanner is closed, can not read user inputs again
/*
        System.out.println("Enter your fifth number: ");

        int num5 = (int)input.nextLong();
*/
        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);
        System.out.println("Third number: "+num3);
        System.out.println("Fourth number "+num4);

    }
}

/*

 */