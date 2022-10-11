package day21_multiDimensionalArray;

import java.util.Arrays;

public class Task01 {

    public static void main(String[] args) {

        String str = "   Hello   World                  I    love   java    ",result = "";
        String[] array = str.split(" ");

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            result+=(array[i].isBlank())?"":array[i]+" ";
        }
        result=result.trim();
        System.out.println(result);
        }
    }
