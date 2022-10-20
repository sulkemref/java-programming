package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbbcccc";

        String result = ""; //a3b4c5

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            if(!result.contains(each)){
                result+= each + frequency;
            }
        }
        System.out.println(result);

        System.out.println("-----------------------------------------------------------");
        str = "aaabbbcccc";
        result = ""; //a3b4c5

        Character[] ch = new Character[str.length()];

        for (int i = 0; i < ch.length; i++) {
            ch[i]=str.charAt(i);
        }

        for (Character each : ch) {
            int frequency = Collections.frequency(Arrays.asList(ch),each);

            if(!result.contains(each+"")){
                result += ""+each + frequency;
            }
        }
        System.out.println(result);

    }
}
