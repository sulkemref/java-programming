package day09_scaner;

import java.util.Scanner;

public class MonthName {

    public static void main(String[] args) {

        System.out.print("Enter the month number: ");
        int n = new Scanner(System.in).nextInt();

        String result = "";

        switch (n){
            case 1: result = "January"; break;
            case 2: result = "February";break;
            case 3: result = "March";break;
            case 4: result = "April";break;
            case 5: result = "May";break;
            case 6: result = "June";break;
            case 7: result = "July";break;
            case 8: result = "August";break;
            case 9: result = "September";break;
            case 10: result = "October";break;
            case 11: result = "November";break;
            case 12: result = "December";break;
            default: result = "No such a month";
        }
        System.out.println(result);
    }
}
