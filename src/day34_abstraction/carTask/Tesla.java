package day34_abstraction.carTask;

public class Tesla extends Car{

    public Tesla( String model, int year, double price, String color) {
        super( model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Use voice control to start "+getMake()+ " "+ getModel());
    }

    public void autoPilot(){
        System.out.println(getMake() +" "+getModel()+" has auto pilot feature");
    }

}

