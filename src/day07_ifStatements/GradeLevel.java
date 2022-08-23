package day07_ifStatements;

public class GradeLevel {

    public static void main(String[] args) {
        int gradeLevel = 6; //1 ~ 18

        String result = "";

        if(gradeLevel<6){
            result = "Elementary school";
        }else if(gradeLevel<9){
            result = "Middle school";
        }else if(gradeLevel<13){
            result = "High school";
        }else if(gradeLevel<17){
            result = "College";
        }else{
            result = "Grad School";
        }
        System.out.println(result);
    }
}



/*
Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
Note: Assume that the given number is between 1 ~ 18

 */