package day31_inheritance.shape_methodOverriding;

public class Rectangle extends Shape{

    private double length,wight;

    public Rectangle(double length, double wight) {
        setLength(length);
        setWight(wight);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    @Override
    public double area() {
        return length*wight;
    }

    @Override
    public double perimeter() {
        return (length+wight)*2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t* * * * * * * * *");
        for (int i = 0; i < 3; i++) {
            System.out.println("\t*               *");
        }
        System.out.println("\t* * * * * * * * *");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", length='" + length + '\'' +
                ", wight='" + wight + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
