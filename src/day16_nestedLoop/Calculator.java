package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1, num2;
        char operator;
        String answer = "";

        do {
            System.out.println("Enter the first number:");
            num1 = input.nextDouble();

            do {
                System.out.println("Enter a math operator:");
                operator = input.next().charAt(0);
                if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/'))
                    System.err.println("Invalid operator re-enter:");
            } while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/'));

            do {
                System.out.println("Enter the second number:");
                num2 = input.nextDouble();
                if (num2 == 0 && operator == '/')
                    System.err.println("The divisor can't be zero. Re-enter divisor");
            } while (num2 == 0 && operator == '/');


            System.out.println(num1 + " " + operator + " " + num2 + " = " + simpleMath(num1, num2, operator));

            System.out.println("Would you like to continue?(yes/no)");
            answer = input.next().toLowerCase();

            while (!(answer.equals("no") || answer.equals("yes"))){
                System.err.println("Invalid answer re-enter (yes/no)");
                answer = input.next().toLowerCase();
            }

            } while (!(answer.equals("no")));

        System.out.println("Good bye!");

    }
    public static double simpleMath(double num1,double num2, char operator){
        switch (operator){
            case '+': return num1+num2;
            case '-': return num1-num2;
            case '*': return num1*num2;
            default:return num1/num2;
        }

    }
}
