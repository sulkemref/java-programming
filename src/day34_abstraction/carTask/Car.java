package day34_abstraction.carTask;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;


    public Car(String model, int year, double price, String color) {
        this.make = getClass().getSimpleName(); // to set the class name to the make of the car
        if(model==null||model.isEmpty()||model.isBlank()){
            System.err.println("Invalid model: "+ model+ "\nModel can not be empty");
            System.exit(1);
        }
        this.model = model;
        if(year<1886){
            System.err.println("Invalid year: "+ year+ "\nYear can not be less than 1886");
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.err.println("Invalid price: "+price+"\nPrice can not be negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color==null||color.isEmpty()||color.isBlank()){
            System.err.println("Invalid color: "+ color+ "\nColor can not be empty");
            System.exit(1);
        }
        this.color = color;
    }

    protected final void stop(){ // to make sure that non-sub classes outside the package can not access it
        System.out.println("Press the brake to stop "+ make+" "+model);
    }

    protected abstract void start(); // meat to be overridden

    public String toString() {
        return make+"{" +
                //"make='" + make + '\'' +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price= $" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()
 */