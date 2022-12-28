package extraTopics.predicate;

import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {

        Predicate<Integer> isOdd = a -> {
            if(a % 2 !=0){
                return true;
            }else {
                return false;
            }

        };


        boolean r1 = isOdd.test(21);

        System.out.println(r1);

        Predicate<String> isPalindrome = (a) -> {
            String reversed = "";

            for(int i = a.length()-1; i>= 0; i--){
                reversed+=a.charAt(i);
            }

            return a.equalsIgnoreCase(reversed);


        } ;


        boolean r2 = isPalindrome.test("Wooden Spoon");

        System.out.println(r2);
    }
}
