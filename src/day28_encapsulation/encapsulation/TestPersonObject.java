package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {
        Person p1 = new Person("Mila",'F', LocalDate.of(1990,1,1));

        System.out.println(p1);
    }

}
