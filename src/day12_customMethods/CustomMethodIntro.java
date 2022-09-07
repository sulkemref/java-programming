package day12_customMethods;

import java.util.Scanner;

public class CustomMethodIntro {

    public static void main(String[] args) {

        System.out.println("Test started");

        greetings();

        System.out.println("Test completed");

        System.out.println("-------------------------------------------");

        displayMessage();

        int x = 90;

        displayValue(new Scanner(System.in).nextInt());

    }
    public static void greetings() {

        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");
        System.out.println("Are you ready to learn Java");

    }

    public static void displayMessage(){
        System.out.println("Hello World");
        System.out.println("I love Java");

    }

    public static void displayValue(int num){

        System.out.println("The value is "+ num);
    }
}
