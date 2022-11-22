package day34_abstraction.carTask;

public class TestCarObjects {


    public static void main(String[] args) {

      //  Car car = new Car("X6","Red",2020,45000);

        Honda honda = new Honda("Pilot",2019,35000 ,"Black");

        Audi audi = new Audi("Q6",2020,3600,"Silver");

        Tesla tesla = new Tesla("Model Y",2022,60000,"Blue");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("--------------------------------------------------------");

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("---------------------------------------------------------");

        honda.start();
        audi.start();
        tesla.start();

        System.out.println("---------------------------------------------------------");
        audi.autoPark();
        tesla.autoPilot();


    }



}
