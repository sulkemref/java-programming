package extraTopics.genericsMethodAndClass;

import java.util.List;

public class Generics <T>{

    public  void printEach(T[] t){
        for (T each : t) {
            System.out.println(each);
        }
    }

    public  void printEach(List<T> list){

        for (T each : list) {
            System.out.println(each);
        }
    }
}
