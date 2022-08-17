package day06_ifStatemets;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = -120;

        boolean isPositive= number > 0,
                isNegative = number <0,
                isZero = !isPositive && !isNegative;

        System.out.println(number+" is positive number: "+isPositive
        +"\n"+number+" is negative number: "+isNegative
        +"\n"+ number+" is zero: "+isZero);
    }
}

/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false

 */