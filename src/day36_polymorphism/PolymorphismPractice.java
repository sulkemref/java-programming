package day36_polymorphism;

import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day30_inheritance.phoneTask.Samsung;

public class PolymorphismPractice {


    public static void main(String[] args) {

        //   IPhone phone = new Phone("Iphone 11 Pro", "Large", "Black", 900);

       // Phone phone =  //new Samsung("Galaxy S19", "Medium", "Pink", 700);
             //   new IPhone("Iphone 11 Pro", "Large", "Black", 900);

        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Smalle", "Gold", 400),
                new IPhone("Iphone 7", "Smalle", "White", 500)
        };


        int countIphone = 0, countSamsung = 0;
        for(Phone each : phones){
            System.out.println(each.getModel()+" - "+ each.getColor()+" - "+ each.getPrice());
            countIphone+=(each instanceof IPhone)?1:0;
            countSamsung+=(each instanceof Samsung)?1:0;
        }
        System.out.println("-------------------------------------------------");
        System.out.println("countIphone = " + countIphone);
        System.out.println("-------------------------------------------------");
        System.out.println("countSamsung = " + countSamsung);
        System.out.println("-------------------------------------------------");


        for(Phone each : phones){
            System.out.print(((each instanceof IPhone||each instanceof Samsung)&&each.getPrice()>700)? each.getModel()+"\n":"");
        }


    }
}
/*
1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsungs in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater
 */