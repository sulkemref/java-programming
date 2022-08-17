package day06_ifStatemets;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 11,
        result=1;

        if(number == 2){
            result = 28;
        }
        if(number == 4||number == 6||number == 9||number == 11){

            result =30;
        }
        if(result == 1){

            result=31;
        }

        System.out.println(result+ " days");

        System.out.println("----------------------------------------------");


        int n=1;

        boolean has28Days = n ==2,
                has30Days = n ==4||n==6||n==9||n==11,
                has31Days = !has28Days&&!has30Days;
                    //it he month does not have 28 days and also does not have 30 days, then the month has 31 days

        String result1="";

        if(has28Days){
            result1 = "28 days";

        }

        if(has30Days){
            result1 = "30 days";
        }

        if(has31Days){

            result1 = "31 days";
        }

        System.out.println(result1);

    }
}

/*
1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month
Ex:
Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2

 */