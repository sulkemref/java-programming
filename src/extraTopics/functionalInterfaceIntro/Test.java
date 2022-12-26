package extraTopics.functionalInterfaceIntro;

public class Test {

    public static void main(String[] args) {

        MyFunction<Integer> displayCube = (a) ->{
            System.out.println(a * a * a);
        };

        displayCube.function(3);


        MyFunction<String> thirdCharacter = a -> System.out.println("Third character is "+a.charAt(2));

        thirdCharacter.function("Cydeo");
    }
}
