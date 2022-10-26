package day26_statics;

public class ConstructorCalls {

    public ConstructorCalls(){
      //  this(9);
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){
        //this();
        this(2.5);
        System.out.println("Constructor with String argument ");

    }

    public static void main(String[] args) {

        method1();

        System.out.println("------------------------------------------");

        method2();

    }

    public static void method1(){
        System.out.println("Method 1");

    }
    public static void method2(){
        method1();
        System.out.println("Method 2");
        method2();
    }

}
