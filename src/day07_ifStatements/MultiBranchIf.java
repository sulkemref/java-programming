package day07_ifStatements;

public class MultiBranchIf {

    public static void main(String[] args) {

        int num= 100;

        String result = "";

        if(num>0){
            result = "Positive";
        }
        if(num<0){
            result = "Negative";
        }
        if(num == 0){
            result = "Zero";
        }

        System.out.println(result);

        System.out.println("-----------------------------------------------");

        String result2="";

        if(num > 0){
            result2 = "Positive";
        }else if(num <0 ){
            result2 = "Negative";
        }else{
            result2="Zero";
        }
        System.out.println(result2);
    }
}
/*
1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero
Ex:
number = 20
output:
Positive

 */