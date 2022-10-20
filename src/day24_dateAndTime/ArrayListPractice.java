package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        for( Employee each : employees ){

            System.out.println(each.name+ " : "+ each.jobTitle);
        }

        System.out.println("--------------------------------------------------------------------");

        for (Employee each : employees) {
            if(each.jobTitle.equals("Java Developer")){
                System.out.println(each.name);
            }
        }

        System.out.println("--------------------------------------------------------------------");

        double minSalary = employees.get(0).salary,maxSalary = employees.get(0).salary;
        int minSalaryIndex = 0, maxSalaryIndex = 0;

        for(int i = 0; i< employees.size(); i++){
            if(minSalary>employees.get(i).salary){
                minSalary=employees.get(i).salary;
                minSalaryIndex=i;
            }
            if(maxSalary<employees.get(i).salary){
                maxSalary=employees.get(i).salary;
                maxSalaryIndex=i;
            }
        }
        System.out.println("Maximum salary is: $"+employees.get(maxSalaryIndex).salary+"\nMinimun salary is: $"+employees.get(minSalaryIndex).salary);

        System.out.println("--------------------------------------------------------------------");

        ArrayList<Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Employee> maleEmployees = new ArrayList<>();

        for ( Employee each : employees){
            if(each.gender=='F'){
                femaleEmployees.add(each);
            }else{
                maleEmployees.add(each);
            }
        }

        System.out.println(femaleEmployees);
        System.out.println();
        System.out.println(maleEmployees);
        System.out.println();
        System.out.println("Total number female employees: "+femaleEmployees.size());
        System.out.println("Total number male employees: "+maleEmployees.size());

    }
}
/*
1. Given the following arraylist of Employees:
			ArrayList<Employee> employees = new ArrayList<>();
	        employees.addAll(Arrays.asList(
	               new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
	        ));

	        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
	        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
	        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
	        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
	        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

	        Note: Employee class is imported from day17 package

	        1.1 Write a program that can display the name and job title of each employee

	        1.2 Write a program that can display the names of "Java Developers"

	        1.3 Write a progam that can display the maximum and minimum salary

	        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
	         can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists

 */