package day31_inheritance.shape_methodOverriding;

public class Circle extends Shape{

    private double radius;

    public static double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t   ......");
        System.out.println("\t *        *");
        System.out.println("\t*          *");
        System.out.println("\t*          *");
        System.out.println("\t *        *");
        System.out.println("\t   ``````");

        // code complete by myself
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", radius='" + radius + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
