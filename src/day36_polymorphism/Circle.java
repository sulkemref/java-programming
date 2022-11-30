package day36_polymorphism;

import java.text.DecimalFormat;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {

    DecimalFormat df = new DecimalFormat("0.00");

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return pow(radius,2)*PI;
    }

    public double perimeter(){
        return 2*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + df.format(area()) +
                ", perimeter=" + df.format(perimeter()) +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Circle)){ // if the specified object is not circle, then we should not compare them
            System.err.println("Invalid Object");
            System.exit(1);
        }

        if(radius == ((Circle) obj).getRadius()){ // if the current circle's radius is equal to the given circle's radius, the two circles are equal
            return true;
        }

        return false;
    }

    // .equals()
}
