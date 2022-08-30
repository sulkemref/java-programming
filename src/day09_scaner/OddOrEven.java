package day09_scaner;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        int number = new Scanner(System.in).nextInt();

        boolean isEven = number % 2 == 0;
        String result ="";

        result = (isEven)?" is on even number":" is on odd number";

        System.out.println(number+result);
    }
}
