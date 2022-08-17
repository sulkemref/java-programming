package day06_ifStatemets;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        int number = 10;

        boolean isEven = number%2==0;

        if(number%2==0&& number!=0){
            System.out.println(number+" is even");
        }

        if(number%2!=0&& number!=0){

            System.out.println(number+" is odd");
        }
        if(number==0){

            System.out.println(number+" is zero");
        }

        System.out.println("---------------------------------------------");

        int number2 = 10;

        boolean isEven2 = number2%2==0;

        if(number%2==0&& number!=0){
            System.out.println(number2+" is even");
        }

        if(number2!=0){

            System.out.println(number2+" is odd");
        }
        if(number2==0){

            System.out.println(number2+" is zero");
        }

    }
}
