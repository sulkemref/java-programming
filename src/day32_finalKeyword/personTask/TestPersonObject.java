package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991,1,25));

        System.out.println(person);

        System.out.println("------------------------------------------");

        Employee employee = new Employee("Emily",'F',LocalDate.of(1989,2,5),"Accontant",100000);

        System.out.println(employee);

        employee.breath();

        Student student = new Student("Kemal",'M',LocalDate.of(1990,1,16), "A34","Java",'A');

        System.out.println(student);

    }

}
