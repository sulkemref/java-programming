package extraTopics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOperations {

    public static void main(String[] args) {

        System.out.println("------------------------------------Collect------------------------------");

        List<String> words = new ArrayList<>();

        words.addAll(Arrays.asList(
                "Java", "Python", "Job", "Apple", "Wooden Spoon", "JavaScript",
                "Jeep", "Samsung", "Book", "Computer", "Camera"
        ));


        Set<String> result= words.stream().filter( p -> p.startsWith("J")).collect(Collectors.toSet());

        System.out.println(result);


        System.out.println("-------------------------------toArray-----------------------------------");

        int[] numbers = {10, 15, 20 ,25, 30, 35, 40, 45, 50 };

        int[] result1 = Arrays.stream(numbers).filter( p -> p%2 == 0).toArray();

        System.out.println(Arrays.toString(result1));




        System.out.println("-------------------------------Count-----------------------------------");


        long n = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).count();

        System.out.println(n);

        String[] words1 = {"Java", "Python", "C#", "C++", "Java", "Ruby", "Swift", "Java", "Java" };

        long a =  Arrays.stream(words1).filter(p -> p.equals("Java")).count();

        System.out.println(a);

        System.out.println("-------------------------------Reduce-----------------------------------");

        int[] arr = {1, 2, 3, 4 ,5};

        int sum = Arrays.stream(arr).reduce(0, ( s ,b ) -> s+b );

        System.out.println(sum);

        String[] words2 = {"Java", "Python", "C#", "Java" };

        String s =Arrays.stream(words2).reduce("",(x,y) -> x +" "+ y);

        System.out.println(s);

        System.out.println("-------------------------------forEach-----------------------------------");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));


        list.stream().filter(p -> p > 5).forEach(p -> System.out.println(p));


        System.out.println("-------------------------------Match-----------------------------------");

        // allMatch(Predicate): check if the elements in the stream matches with th specified predicate
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9,90};

        boolean r1 = Arrays.stream(nums1).allMatch(p -> p<10);

        System.out.println(r1);

        //anyMatch(Predicate): checks if any the elements in the stream matches with the specified predicate
        int [] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean r2 = Arrays.stream(nums2).anyMatch(p -> p%2==0);

        System.out.println(r2);

        //nonMatch(Predicate): checks if All the elements in the stream matches with the specified predicate
        int [] nums3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean r3 = Arrays.stream(nums3).noneMatch(p -> p>=10);

        System.out.println(r3);

    }
}
