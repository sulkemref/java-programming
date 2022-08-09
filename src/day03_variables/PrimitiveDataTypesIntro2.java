package day03_variables;

public class PrimitiveDataTypesIntro2 {

    public static void main(String[] args) {

        // DataType variableName = Data;

        char a = '@';
        char b = '!';
        System.out.println(a);

        char ch1 = 'A';
        char ch2 = 65;

        System.out.println("-------------------------------");

        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("-------------------------------");

        char ch3 = 40000;

        System.out.println(ch3);

        System.out.println("-------------------------------");

        int sum = 'A' + 'B';
        //      asci table 65+66=131
        //char sum2 = 'A' + 'A'; dont work

        System.out.println(sum);


        System.out.println("--------------------------------");


        //char ch4 = -100;



        //boolean r1 = day33_class_notes.txt;
        //boolean r2 = 2.5;
        //boolean r3 = "Java";

        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10; // true
        boolean r7 = 0 < -1; //false

        System.out.println(r6);
        System.out.println(r7);

    }

}
