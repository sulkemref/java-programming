package extraTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperations {

    public static void main(String[] args) {

        System.out.println("----------------------------Distinct---------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,7,7,8,9));


        numbers = numbers.stream().distinct().collect(Collectors.toList());


        System.out.println(numbers);

        System.out.println("-------------------------------------------------");

        int[] nums = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,6,7,7,8,9};

        nums = Arrays.stream(nums).distinct().toArray();

        System.out.println(Arrays.toString(nums));

        System.out.println("--------------------------Skip-----------------------");

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));


        System.out.println(numbers1);

        numbers1 = numbers1.stream().skip(5).collect(Collectors.toList());

        System.out.println(numbers1);

        System.out.println("--------------------------Limit-----------------------");

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));

        numbers2 = numbers2.stream().limit(5).collect(Collectors.toList());

        System.out.println(numbers2);

        System.out.println("--------------------------Map-----------------------");

        List<Integer> numbers3 = new ArrayList<>();

        numbers3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        numbers3 = numbers3.stream().map(a -> {
            if (a % 2 == 0) {
                return a * 3;
            } else {
                return a * 10;
            }
        }).collect(Collectors.toList());

        System.out.println(numbers3);

        System.out.println("--------------------------Filter-----------------------");

        List<Integer> numbers4 = new ArrayList<>();

        numbers4.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        numbers4 = numbers4.stream().filter( a -> a%2==0).map(a->a*10).collect(Collectors.toList());

        System.out.println(numbers4);

        System.out.println("--------------------------Sorted-----------------------");

        List<Integer> numbers5 = new ArrayList<>();

        numbers5.addAll(Arrays.asList(20,10,9,15,12,0,1,3,4,5));

        List<Integer> list = numbers5.stream().sorted().collect(Collectors.toList());

        System.out.println(list);

        System.out.println("--------------------------Peek-----------------------");


        List<Integer> numbers6 = new ArrayList<>();

        numbers6.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

        List<Integer> result = numbers6.stream().filter(p -> p % 5 == 0).peek(a -> System.out.println(a)).collect(Collectors.toList());

        System.out.println(result);
    }
}
