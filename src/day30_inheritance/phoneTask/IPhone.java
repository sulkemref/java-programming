package day30_inheritance.phoneTask;

public class IPhone extends Phone { // IPhone Is a Phone

    public IPhone( String model, String size, String color, double price){
        super("Apple", model, size, color, price);
    }
    public static boolean hasApplePay = true;

    public void faceTime(long phoneNumber){
        System.out.println(getBrand()+" "+getModel()+" is face timing with "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getBrand()+" "+ getModel()+" is face timing with "+ email);
    }

}
/*
2. Create the following sub classes of Phone:

			2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)

			2.2 Samsung:
					Extra methods:
						freeze()

			2.3 Nokia:
					Extra methods:
						selfDefense()
 */