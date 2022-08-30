package day09_scaner;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        System.out.println("Enter the day number: ");
        //int num = input.nextInt();
        int num = new Scanner(System.in).nextInt(); // if  I want to use input once

        String day = "Invalid";

        if(num>0&& num<8){
            day = (num==1)?"Monday"
                    :(num==2)?"Tuesday"
                    :(num==3)?"Wednesday"
                    :(num==4)?"Thursday"
                    :(num==5)?"Friday"
                    :(num==6)?"Saturday"
                    :"Sunday";
        }

        System.out.println(day);

       // input.close();

    }
}
