package day21_multiDimensionalArray;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {


   //                     0  1  3     0  1  2  3  4    0   1
        int[][] arr2D = {{10,20,30}, {40,50,60,70,80}, {90,100}};
  // index of 1D array :     0               1            2

        for (int i = 0; i < arr2D.length; i++) { // i: index number of 1D array in arr2D

            int[] each1D = arr2D[i];
           //System.out.println(Arrays.toString(each1D));

            for (int j = 0; j < each1D.length; j++) { // j: index number of elements in each 1D array of arr2D
              //  System.out.print(arr2D[i][j]+" ");

                int eachElement = each1D[j];

                System.out.print(eachElement+ " ");

            }


        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------");


        for(int[] each1DArray :arr2D){
          //  System.out.println(Arrays.toString(each1DArray));
            for (int eachElement : each1DArray) {
                System.out.print(eachElement+ " ");
            }

        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]+" ");
            }
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        for (int[] each1DArray : arr2D) {
            for (int eachElemnt : each1DArray) {
                System.out.print(eachElemnt+ " ");
            }

        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------");


    }
}
