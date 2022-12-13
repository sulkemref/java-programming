package day40_collections;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>(); // order is random, does not accept null
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        // queue1.addAll(Arrays.asList(null, null, null));

        System.out.println(queue1);

        int num1 = queue1.poll(); // ==> FIFO

        System.out.println(queue1);

        queue1.poll();
        queue1.poll();
        queue1.poll();

        System.out.println(queue1);

        Queue<Integer> queue11 = new PriorityQueue<>();

        for(int i = 0; i<101;i++){
            queue11.add(i);
        }

        System.out.println(queue11);

        for(int i = 0; i<101;i++){
            System.out.print(queue11.poll()+" ");
        }

        System.out.println(queue11);




        System.out.println("---------------------------------------------------");


        Queue<Integer> queue2 = new ArrayDeque<>(); // insertion order, accepts null, has index
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //queue2.addAll(Arrays.asList(null, null, null));


        System.out.println(queue2);

        queue2.poll();

        System.out.println(queue2);

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2);

        //System.out.println(queue2.get(1));

        System.out.println("---------------------------------------------------");

        Queue<Integer> queue3 = new LinkedList<>(); // insertion order
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(queue3);

        queue3.poll();

        //queue3.get(1);

        System.out.println(queue3);

        System.out.println(  ((LinkedList)queue3).get(4) );

        System.out.println("---------------------------------------------------");


        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list);

        System.out.println( ((LinkedList)list).poll() ); //FiFo

        System.out.println(list);


        //((Stack)list).pop();

        System.out.println(list);


    }

}
