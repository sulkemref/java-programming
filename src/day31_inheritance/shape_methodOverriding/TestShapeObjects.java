package day31_inheritance.shape_methodOverriding;

public class TestShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(5);

        System.out.println(square);

        square.draw();

        Circle circle = new Circle(3.5);

        System.out.println(circle);

        circle.draw();

        Rectangle r1 = new Rectangle(5,6);

        System.out.println(r1);

        r1.draw();

        Triangle t1 = new Triangle(5,4);

        t1.draw();

        System.out.println(Circle.pi);
        System.out.println(circle.pi);

        Shape shape = new Shape();
        shape.perimeter();


    }



}
