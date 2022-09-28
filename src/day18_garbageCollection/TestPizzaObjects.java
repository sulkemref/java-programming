package day18_garbageCollection;

public class TestPizzaObjects {

    public static void main(String[] args) {

       Pizza pizza1 = new Pizza();
      // pizza1.size='l';

        pizza1.setInfo('L',2,3);

        Pizza pizza2 = new Pizza();
       // pizza2.size='M';

        pizza2.setInfo('S',1,2);

        System.out.println(pizza1.toString());
        System.out.println(pizza2);

        System.out.println("--------------------------------------------------");

        double total = 0;

        Pizza small = new Pizza();
        small.setInfo('S',2,2);
        Pizza medium= new Pizza();
        medium.setInfo('M',3,4);
        Pizza large = new Pizza();
        large.setInfo('L',4,5);

        for (int i = 0; i < 20; i++) {

            total+=small.calcCost();

            total+=medium.calcCost();

            total+=large.calcCost();
        }

        System.out.println("total = " + total);

    }
}
