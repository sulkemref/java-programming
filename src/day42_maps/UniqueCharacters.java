package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {

        Map<Character,Integer> map = new LinkedHashMap<>();

        String str = "aabcccdeeeef";

        for(int i = 0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.replace(str.charAt(i),0);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i = 0; i<str.length(); i++) {
            if (map.containsKey(str.charAt(i))&&map.get(str.charAt(i))==0){
                map.remove(str.charAt(i));
            }

        }
        System.out.println(map);

        System.out.println("--------------------------------------------------------");

        Map<Character,Integer> map1 = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);

            // System.out.println(each + " : "+frequency);

            //map1.put(each.charAt(0),frequency);
            if(frequency==1)
                map1.put(each.charAt(0),frequency);

        }

        System.out.println(map1);



    }
}
/*
2. Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";

	            output:
	                    {b=1, d=1, f=1}
 */