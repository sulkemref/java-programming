package day28_encapsulation.encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {
/*
        Employee employee1 = new Employee();
       // employee1.salary = -200_000;

        employee1.setSalary(100000);

        System.out.println(employee1.getSalary());

        //employee1.setName("          ");
        //employee1.setName("");

        System.out.println(employee1.getName());

        employee1.setJobTitle("SDET");

        System.out.println(employee1.getJobTitle());
*/

        Employee employee1 = new Employee("Khashyar", 45,"Java",100000);


        System.out.println(employee1);
    }


}
