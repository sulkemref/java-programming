package extraTopics.biConsumer;

import java.util.function.BiConsumer;

public class Test {

    public static void main(String[] args) {


        BiConsumer<String, Integer> printMultipleTimes = (a,b) -> {
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        };

        printMultipleTimes.accept("Hello World",5);
    }
}
