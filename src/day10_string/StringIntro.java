package day10_string;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";


        System.out.println("-----------------------------------------");

        String t1 = "Python";
        String t2 = new String("Python");
        String t3 = new String("Python");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);


        System.out.println(t1 == t2);
        System.out.println(t2 == t3);

    }
}
