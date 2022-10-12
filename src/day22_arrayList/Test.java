package day22_arrayList;

import utilities.ArraysUtility;

import java.util.Arrays;


public class Test {

    public static void main(String[] args) {

    int[] numbers = {10, 20, 30, 40, 50, 60, 70, 90};

    boolean has25 = ArraysUtility.contains(numbers,25);

    System.out.println(has25);


    System.out.println("-------------------------------------");

        String[] students = {"Sumeye", "Hamza", "Marika"};

        System.out.println( ArraysUtility.contains(students, "Khashayar")  );

        System.out.println("-------------------------------------");

        int[] arr = {1,2,3,4,5,6};

        int[] newArray = ArraysUtility.remove(arr,1);

        System.out.println(Arrays.toString(newArray));


        System.out.println("-------------------------------------");

        int[] arr2 = {1,2,2,2,3,3,4,5,6,1,2,4,7,7,99};

        int[] newArray2 = ArraysUtility.replace(arr2,1,50);

        System.out.println(Arrays.toString(newArray2));

        System.out.println("-------------------------------------");

        int[] arr3 = {1,2,2,2,3,3,4,5,6,1,2,4,7,7,99};

      // ArraysUtility.replaceAll(arr3,2,90);

        //System.out.println(Arrays.toString(newArray3));

        System.out.println("Dup");
        //Arrays.sort(arr3);
        //arr3 = ArraysUtility.removeDup(arr3);

        System.out.println(Arrays.toString(ArraysUtility.removeDup(arr3)));


        System.out.println("-------------------------------------");

        int[] arr4 = {10, 20, 30, 40, 50};

        int[] newArray4 = ArraysUtility.insert(arr4,0,100);

        System.out.println(Arrays.toString(newArray4));

        System.out.println("-------------------------------------");

       int[] arr5 = {10, 20, 30, 40, 50};

        int[] newArray5 = ArraysUtility.swap(arr5,2,4);

        System.out.println(Arrays.toString(newArray5));

        System.out.println("-------------------------------------");
    }
}
/*
Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}
 */