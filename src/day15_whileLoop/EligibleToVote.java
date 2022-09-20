package day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt(); // valid age 1 ~ 120

        while(!(age>0&& age<121)){ // while the age is not valid

            System.err.println("Invalid Entry, Please re-enter your age: ");
            age = input.nextInt();

        }

        System.out.println("Are you a US Citizen? Yes/No");// Yes
        String yerOrNo = input.next().toLowerCase();

        while(!(yerOrNo.equals("yes")||yerOrNo.equals("no"))){
            System.err.println("Invalid Entry! Please re-enter");
            System.out.println("Are you a US Citizen? Yes/No");// Yes
            yerOrNo = input.next().toLowerCase();

        }


        if(age>=21&& yerOrNo.equals("yes")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

        input.close();
    }
}
