package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1,int[] arr2){

        int arr3Length = arr1.length+arr2.length;
        int[] arr3 = new int[arr3Length];

        for (int i = 0; i < arr3Length; i++) {

            if(i<arr1.length){
                arr3[i] = arr1[i];
            }else {
                int k=i-arr1.length;
                arr3[i]=arr2[k];
            }
        }
        return arr3;
    }

    public static double[] merge(double[] arr1,double[] arr2){

        int arr3Length = arr1.length+arr2.length;
        double[] arr3 = new double[arr3Length];

        for (int i = 0; i < arr3Length; i++) {

            if(i<arr1.length){
                arr3[i] = arr1[i];
            }else {
                int k=i-arr1.length;
                arr3[i]=arr2[k];
            }
        }
        return arr3;
    }

    public static char[] merge(char[] arr1,char[] arr2){

        int arr3Length = arr1.length+arr2.length;
        char[] arr3 = new char[arr3Length];

        for (int i = 0; i < arr3Length; i++) {

            if(i<arr1.length){
                arr3[i] = arr1[i];
            }else {
                int k=i-arr1.length;
                arr3[i]=arr2[k];
            }
        }
        return arr3;
    }

    public static String[] merge(String[] arr1,String[] arr2){

        int arr3Length = arr1.length+arr2.length;
        String[] arr3 = new String[arr3Length];

        for (int i = 0; i < arr3Length; i++) {

            if(i<arr1.length){
                arr3[i] = arr1[i];
            }else {
                int k=i-arr1.length;
                arr3[i]=arr2[k];
            }
        }
        return arr3;
    }

    public static int[] reverse(int[] array){

        int[] reverse = new int[array.length];

        for (int i = array.length - 1,j=0 ; i >= 0; i--) {
            reverse[j++]=array[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] array){

        double[] reverse = new double[array.length];

        for (int i = array.length - 1,j=0 ; i >= 0; i--) {
            reverse[j++]=array[i];
        }
        return reverse;
    }

    public static String[] reverse(String[] array) {

        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }
        return reverse;
    }
    
    public static char[] reverse(char[] array) {

        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }
        return reverse;
    }

    public static int[] addElement(int[] array, int element){
        int[] new_array = Arrays.copyOf(array, array.length+1);
        new_array[new_array.length-1]=element;
        return new_array;
    }

    public static double[] addElement(double[] array, double element){
        double[] new_array = Arrays.copyOf(array, array.length+1);
        new_array[new_array.length-1]=element;
        return new_array;
    }

    public static String[] addElement(String[] array, String element){
        String[] new_array = Arrays.copyOf(array, array.length+1);
        new_array[new_array.length-1]=element;
        return new_array;
    }

    public static boolean contains(int[] array, int element){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String element){

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(double[] array, double element){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] array, char element){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==element){
                return true;
            }
        }
        return false;
    }

    public static int[] remove(int[]array, int index){
        int [] newArray = new int[array.length-1];
        for (int i = 0,j = 0; i < array.length; i++,j++) {
            if(index==i){
                j--;
                continue;
            }
            newArray[j]=array[i];

        }
        return newArray;
    }

    public static int[] removeDup2(int[] array){
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i]==array[j]){
                    count++;
                }
                if(count==2){
                    array=ArraysUtility.remove(array,j);
                    count--;
                }
            }
        }
        return array;
   }

   public static int[] removeDup(int[] array){
       int newArray[] = new int[0];
        for (int each : array) {
           if(ArraysUtility.contains(newArray,each)){
               continue;
           }
            newArray = ArraysUtility.addElement(newArray,each);
       }

        return newArray;
   }

   public static int[] replace(int[] array,int index, int element){
       array[index]=element;
        return array;
   }

    public static int[] replaceAll(int[] array,int oldElement, int newElement){
        for (int i = 0; i < array.length; i++) {
            array[i]=(array[i]==oldElement)?newElement:array[i];
        }
        return array;
    }
    public static int[] insert(int[] array,int index, int element){
        int[] newArray = new int[array.length+1];

        for (int i = 0; i < newArray.length; i++) {
            if(i<index){
                newArray[i]=array[i];
            }else if(i==index){
                newArray[i]=element;
            }else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }

    public static int[] swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
        return array;
    }
}
