package day13_customMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {


       // int total = sum(20,40); // sum is a void, does not return any data

      int total = addition(10,20);

        System.out.println(total);

        System.out.println(square(10));

        int t=square(890);

        System.out.println(t);

        System.out.println(cube(5));

      //  System.out.println(square(square(5))); ^4



    }
/*
    public static void sum(int n1, int n2){
        int result = n1+n2;
        System.out.println(result);

    }*/

   public static int addition(int n1, int n2){
       int result = n1+n2;
       return result;
       //return n1+n2;
   }

   public static int square(int num){
       return num*num;
   }

   public static int cube(int num){
       int cube = square(num)*num;
       return cube;
   }

}
