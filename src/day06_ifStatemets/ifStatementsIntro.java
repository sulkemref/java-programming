package day06_ifStatemets;

public class ifStatementsIntro {

    public static void main(String[] args) {

        int number = 400;

        boolean isPositive = number > 0,
                isNegative = number < 0,
                isZero = number == 0;

        if (isPositive) {

            System.out.println(number + " is positive");

        }


        if (isNegative) {
            System.out.println(number + " is negative");
        }


        if (isZero) {

            System.out.println(number + " is zero");
        }


        System.out.println("-------------------------------------------------");


        int num = 0;

        if(num >0){
            System.out.println(number+ " is positive number");

        }

        if(num< 0){

            System.out.println(num+ " is negative number");


        }

        if(num==0){

            System.out.println(num+" is zero");
        }

    }
}
