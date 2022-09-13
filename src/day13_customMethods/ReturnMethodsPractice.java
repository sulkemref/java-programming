package day13_customMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {

        int a=11;

        System.out.println("Is "+a+" is odd = "+isOdd(a));

        System.out.println("Is "+a+" is even = "+isEven(a));

        int a1 = -9, a2=85;

        System.out.println("Max is "+max(a1,a2));

        System.out.println("Min is "+min(a1,a2));


    }
    public static boolean isOdd(int num){
        return num%2!=0;
    }
    public static boolean isEven(int num){
       // return num%2==0;
        return !isOdd(num);
    }

    public static int max(int num1, int num2){
        return (num1>num2)?num1:num2;
    }
    public static int min(int num1, int num2){
        return (num1<num2)?num1:num2;
    }



}

/*
Create a method named isOdd, that can return true if a number is an odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */
