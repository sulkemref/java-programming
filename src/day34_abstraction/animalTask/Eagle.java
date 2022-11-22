package day34_abstraction.animalTask;

public class Eagle extends Animal implements Flyable,WildAnimal{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName()+" "+getName()+ " is eating snakes");
    }

    @Override
    public void fly() {

    }

    @Override
    public void hunt() {

    }
}
