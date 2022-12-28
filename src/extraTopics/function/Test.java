package extraTopics.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test {

    public static void main(String[] args) {

        Function<int[], List<Integer>> arrayToList = a-> {
            List<Integer> result = new ArrayList<>();

            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int [] nums = {10,20,30,40,50,60};

        List<Integer> list = arrayToList.apply(nums);

        System.out.println(list);

    }
}
