package day19_array;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Gulcin";
        myGroup[myGroup.length-1] = "Assel";
        myGroup[2] = "Sumeye";
        myGroup[1] = "Abidullah";
        myGroup[3] = "Khashayer";

        System.out.println(Arrays.toString(myGroup));


        myGroup[1] = "Kuzzat";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------------------------");

        for (int i = myGroup.length-1; i >=0 ; i--) {

            System.out.println(myGroup[i]);

        }

        System.out.println("--------------------------------------");



    }
}
