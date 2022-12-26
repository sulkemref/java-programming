package extraTopics.functionalInterfaceDemo;

public class Test {

    public static void main(String[] args) {

        MyFunction cube = (a) -> {
            System.out.println(a*a*a);
        };


        cube.test(10);


        MyFunction oodOrEven = (a) -> {
            if(a%2==0){
                System.out.println(a+" is even");
            }else {
                System.out.println(a+" ;xis dd");
            }
        };

        oodOrEven.test(21);

    }
}
