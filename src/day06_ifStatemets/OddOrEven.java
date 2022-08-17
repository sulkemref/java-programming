package day06_ifStatemets;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 75;

        boolean isEven = number % 2 == 0;

        System.out.println(number+" is on even number :"+isEven+"\n"+number+" is on odd number: "+!isEven);



    }
}

/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)

 */