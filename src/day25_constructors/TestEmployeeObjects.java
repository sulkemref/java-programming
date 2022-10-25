package day25_constructors;

import java.time.LocalDate;


public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("Khashayar",32,'M',"Java Developer",95000, LocalDate.of(2022,12,2));

        Employee e2 = new Employee("Mohammad", 31, 'M', "Project Manager", 120000, LocalDate.of(2021, 5, 1));


        System.out.println(e1);

        System.out.println(e2);

        Person p1 = new Person("Alex",'M',LocalDate.of(1990,12,1),true,true);
        Person p2 = new Person("Mila",'F',LocalDate.of(1989,9,5),true,true);
        Person p3 = new Person("Fikret",'M',LocalDate.of(1988,3,2),false,true);
        Person p4 = new Person("Ivan",'M',LocalDate.of(1956,4,6),true,true);
        Person p5 = new Person("Igor",'M',LocalDate.of(1995,4,12),true,false);


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }
}
