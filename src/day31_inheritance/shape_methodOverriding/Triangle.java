package day31_inheritance.shape_methodOverriding;

public class Triangle extends Shape{

    private double side, height;

    public Triangle(double side, double height) {
        setSide(side);
        setHeight(height);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return side/2*height;
    }

    @Override
    public double perimeter() {
        return side*3;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t    ^");
        System.out.println("\t   / \\");
        System.out.println("\t  /   \\");
        System.out.println("\t /     \\");
        System.out.println("\t/       \\");
        System.out.println("\t_________");

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", side='" + side + '\'' +
                ", height='" + height + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
