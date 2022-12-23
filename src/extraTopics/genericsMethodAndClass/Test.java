package extraTopics.genericsMethodAndClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40, 50};

        Double[] decimals = {1.5, 2.5, 3.5, 4.5, 5.5};

        Character[] character = {'A','B','C','D','E'};

        String[] strings = {"Java", "Python", "SQL", "Wooden Spoon"};

      //  Generics.printEach(numbers);

      ///  Generics.printEach(decimals);

     //   Generics.printEach(character);

     //   Generics.printEach(strings);

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30));

     //   Generics.printEach(list);

        Generics<Integer> obj = new Generics<>();
        obj.printEach(numbers);
        obj.printEach(list);

        Generics<Double> obj2 = new Generics<>();
        obj2.printEach(decimals);
    }
}
