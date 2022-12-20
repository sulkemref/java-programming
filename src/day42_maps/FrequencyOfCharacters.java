package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        Map<Character,Integer> map = new LinkedHashMap<>();

        String str = "bbcccaaaaa";

        for(int i = 0; i<str.length(); i++){

            if(map.containsKey(str.charAt(i))){
                map.replace(str.charAt(i),(map.get(str.charAt(i)))+1);
            }else{
                map.put(str.charAt(i),1);
            }

        }

        System.out.println(map);


        System.out.println("--------------------------------------------------------");

        //Map<Character,Integer> map1 = new LinkedHashMap<>();
        Map<String,Integer> map1 = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);

           // System.out.println(each + " : "+frequency);

           //map1.put(each.charAt(0),frequency);
            map1.put(each,frequency);

        }

        System.out.println(map1);

    }
}
/*
1. Write a program that can return the frequency of characters
            Not: MUST use map

                Ex: str = "bbcccaaaaa"

                output:
                    {b=2, c=3, a=5}
 */
