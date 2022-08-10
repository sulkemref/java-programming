package day04_concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Kemal Suleimanov",
                streetName = "Wells",
                buldingNumber ="800S",
                city = "Chicago",
                state = "IL";

        int zipCode = 60607;

        System.out.println("Your shipping address is:\n\t" +name + "\n\t" + buldingNumber + " " + streetName
                +"\n\t" + city + ", " + state+ " " + zipCode);




    }
}


/*

Create a class named ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full shipping address
Ex:
Your Shipping address is:
    Aaron Kissinger
    13621A Legacy Circle
    Fairfax, VA 22030
 */