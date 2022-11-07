package day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',4,"Large","White");

        Cat cat = new Cat();
        cat.setInfo("Felicia","Stray",'F',3,"Medium","Black and White");

        Tiger tiger = new Tiger();
        tiger.setInfo("Shere Khan","Bengal",'M',5,"Large","Orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("----------------------------------------------------------------------------");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();

        tiger.eat();
        tiger.sleep();
        tiger.drink();

        System.out.println("----------------------------------------------------------------------------");

        dog.bark();

        cat.meow();
        cat.scratch();

        tiger.hunt();

        System.out.println("----------------------------------------------------------------------------");

       // System.out.println(dog.name);
       // System.out.println(dog.color);


       // dog.gender = 'K';

        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setAge(8);
        dog.setGender('F');

        System.out.println(dog);



    }
}
