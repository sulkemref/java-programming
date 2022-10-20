package day24_dateAndTime;


import java.util.ArrayList;
import java.util.Arrays;

public class Task02 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2,2,2,2,2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        for(int i = 0; i < numbers.size(); i++){
           if(numbers.get(i)<4){
                numbers.removeAll(Arrays.asList(numbers.get(i)));
            }
        }
        System.out.println(numbers);
    }
}
/*
 2. Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */