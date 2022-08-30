package day09_scaner;

import java.util.Scanner;

public class Eligible {

    public static void main(String[] args) {

        System.out.print("Enter the age of person: ");
        int age = new Scanner(System.in).nextInt();

        String result = (age>0&&age<150)?
                (age>20)?"Eligible"
                        :"Not eligible"
                :"Incorrect age";

        System.out.println(result);
    }
}
