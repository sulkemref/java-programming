package day09_scaner;

import java.util.Scanner;

public class ScannerIntro2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first decimal number: ");
        float num1 = input.nextFloat();

        System.out.println("Enter your second decimal number: ");
        float num2 = input.nextFloat();

        System.out.println("Enter true or false: ");
        boolean r = input.nextBoolean();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("r = " + r);

        input.close();
    }
}
