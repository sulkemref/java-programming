package day19_array;

public class MinMaxNumber {

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = -12;
        arr[2] = 8;
        arr[3] = 19;
        arr[4] = 1;


        int max=arr[0],min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
            if (arr[i]>max) {
                max=arr[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
