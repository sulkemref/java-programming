package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // trim & replace methods make sure that the white spaces & additional spaces between the characters will be removed
        System.out.println("Enter first name:");
        String firstName = input.nextLine().trim().replace(" ","");

        System.out.println("Enter last name:");
        String lastName = input.nextLine().trim().replace(" ","");

        input.close();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName+" "+lastName);


    }
}
