package day09_scaner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String full_name = input.nextLine(); // Kemal Suleimanov + Enter

        System.out.println("Enter your school name: ");
        String school_name = input.nextLine();// Cydeo School + Enter

        System.out.println("Enter your gender: ");
        String gender = input.next(); // Male+Enter

        System.out.println("Enter you age: ");
        int age = input.nextInt(); //28

        input.nextLine(); // clear out the scanner

        System.out.println("Enter your street name: ");
        String street = input.nextLine();
    }
}
