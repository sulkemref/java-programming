package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {
    /*
    3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};
     */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0,13,10,11,12,14,15,16};
        int[] arrayReverse = new int[array.length];

        for (int i = array.length - 1,j=0 ; i >= 0; i--) {
            arrayReverse[j++]=array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayReverse));

        System.out.println("--------------------------------------------------");
        int[] nums = {100,200,300,400,500};
        nums = ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("--------------------------------------------------");

        //double[] a1 = {}
    }
}