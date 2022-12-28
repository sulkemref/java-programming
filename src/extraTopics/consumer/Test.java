package extraTopics.consumer;

import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {


        Consumer<int[]> printEach = arr -> {

            for (int each : arr) {
                System.out.println(each);
            }
        };

        int[] arr = {10,20,30,40,50};

        printEach.accept(arr);
    }
}
