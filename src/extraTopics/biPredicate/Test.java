package extraTopics.biPredicate;

import java.util.function.BiPredicate;

public class Test {

    public static void main(String[] args) {

        BiPredicate<int[],Integer> contains = (a,b) -> {
            for (int each : a) {
                if(each == b){
                    return true;
                }
            }
            return false;
        };

        int[] nums = {100,200,300,400,500};

        boolean r1 = contains.test(nums,500);

        System.out.println(r1);

    }
}
