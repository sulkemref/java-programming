package day12_customMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        maxNum(10.5,5.05);

        System.out.println("------------------------------------");

        maxNum(15000,16000);

        System.out.println("------------------------------------");

        maxNum(-200,-990);

        System.out.println("------------------------------------");

        initial("Cydeo", "School");

        System.out.println("------------------------------------");

    initial("Kemal", "Suleymanov");

        System.out.println("------------------------------------");

        initial("James","Bond");




    }
    // create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)
    public static void maxNum(double num1, double num2){

        if(num1>num2){
            System.out.println(num1+ " is the maximum number");
        }else if(num2>num1){
            System.out.println(num2+ " is the maximum number");
        }else{
            System.out.println("Equal");
        }
    }

    //Create a method that can display the initials of a person  (firstName, lastName)
    public static void initial(String firstName, String lastName){

        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        System.out.println("Initial is: " + initial);

    }

}
