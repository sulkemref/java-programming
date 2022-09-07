package day12_customMethods;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {
        int num1=100;

        oddOrEven(num1);

        int num2 = 35;
        oddOrEven(num2);

        int num3= 79;
        oddOrEven(num3);

        int num4 = 90;
        oddOrEven(num4);


    }

    // create a method that can check if a number is odd, or even or zero (number)
    public static void oddOrEven(int number){
        if(number==0){
            System.out.println(number + " is Zero");
        }else if(number%2!=0){
            System.out.println(number + " is odd number");
        }else{
            System.out.println(number + " is even number");
        }
    }
    // create a method that can check if a person is eligible to buy alcohol  (age)

    public static void eligible(int age){
        if(age > 20){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }


    // create a method that can calculate the grade of the students  (score)

public static void grade(int score){
    String result = (score>0&&score<101)?
            (score>89)?"A"
                    :(score>79)?"B"
                    :(score>69)?"C"
                    :(score>59)?"D"
                    :"F"
            :"invalid score";

    System.out.println(result);
}

}
