package day34_abstraction.carTask;

public class Audi extends Car {

    public Audi(String model, int year, double price, String color) {
        super( model, year, price, color);
    }

    @Override
    public void start(){
        System.out.println("Press the start button to start "+getMake()+" "+getModel());
    }

    public void autoPark(){
        System.out.println(getMake()+ " "+ getModel()+ " has auto park feature");
    }
}
