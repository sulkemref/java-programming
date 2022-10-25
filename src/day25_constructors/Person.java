package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    boolean idMarried;
    boolean isEmployed;

    public Person(String name,  char gender, LocalDate dateOfBirth, boolean idMarried, boolean isEmployed) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.idMarried = idMarried;
        this.isEmployed = isEmployed;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + (LocalDate.now().getYear()-dateOfBirth.getYear()) +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/yy")) +
                ", idMarried=" + idMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public void eat(String food){
        System.out.println(name+" is eating "+ food);
    }

    public void sleeping(){
        System.out.println(name+" is sleeping.");
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }
}
/*
name
age
gender
dateOfBirth mm/dd/yy
idMarried
isEmployed

toString(), eat(String food), sleeping(), drink(String drink)
 */