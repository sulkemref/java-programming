package day29_inheritance.animalTask;

public class Dog extends Animal{// Dog Is An Animal
    //      child       parent
    //      sub         super
    /*
    public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);

        setInfo();
        eat();
        drink();
        sleep();
        toString();
    }

     */

    public void bark(){
        System.out.println(getName()+" is barking");
    }


}
/*
7 variables
5 methods

1. Dog
			attributes:


			methods:
					 bark()
 */