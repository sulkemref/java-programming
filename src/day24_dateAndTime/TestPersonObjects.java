package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = {new Person(),new Person(),new Person(),new Person(),new Person()};

        people[0].setInfo("Daniel", 'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Mike", 'M', LocalDate.of(1966,3,5));
        people[2].setInfo("Alena", 'F', LocalDate.of(1945,4,22));
        people[3].setInfo("Angela", 'F', LocalDate.of(1980,7,17));
        people[4].setInfo("Igor", 'M', LocalDate.of(1975,11,13));


        ArrayList<Person> studentsList= new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));

        for (Person student : studentsList) {
            System.out.println(student.name +" : "+student.age+" : "+student.dateOfBirth);
        }

        System.out.println();
        studentsList.removeIf(student -> student.age>55);

        for (Person student : studentsList) {
            System.out.println(student.name +" : "+student.age+" : "+student.dateOfBirth);
        }

        // print name & date of birth of each person object
        // remove all the person object that has the age > 55


    }
}
