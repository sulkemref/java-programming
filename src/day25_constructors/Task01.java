package day25_constructors;

import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class Task01 {
    /*
    1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

	            Note: DO NOT use any loops

     */

    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> allDogs = new ArrayList<>(Arrays.asList(dogs));

        ArrayList<Dog> smallDogs = new ArrayList<>(allDogs);

        smallDogs.removeIf( dog -> !(dog.size).equalsIgnoreCase("small"));

        System.out.println("----------------------------All----------------------------");
        System.out.println(allDogs);
        System.out.println("----------------------------smallDogs----------------------------");
        System.out.println(smallDogs);

        ArrayList<Dog> youngDogs = new ArrayList<>(allDogs);

        youngDogs.removeIf( dog -> dog.age>4);
        System.out.println("----------------------------youngDogs----------------------------");
        System.out.println(youngDogs);

        ArrayList<Dog> femaleDogs = new ArrayList<>(allDogs);

        femaleDogs.removeIf( dog -> !(dog.gender=='F'));
        System.out.println("----------------------------femaleDogs----------------------------");
        System.out.println(femaleDogs);

        ArrayList<Dog> maleDog = new ArrayList<>(allDogs);

        maleDog.removeIf( dog -> !(dog.gender=='M'));
        System.out.println("----------------------------maleDog----------------------------");
        System.out.println(maleDog);


    }
}
