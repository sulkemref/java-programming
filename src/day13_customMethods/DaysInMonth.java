package day13_customMethods;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();

        if(n<1 || n>12){
            System.err.println("Invalid number");
            return;
        }

        switch (n){
            case 2:
                System.out.println("28 days"); break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");break;
            default:
                System.out.println("31 days");

        }

    }
}
