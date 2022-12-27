package extraTopics.enumTopic;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        //String day = "Java";
        Day day=Day.MONDAY;


        switch (day){

            case MONDAY:
                System.out.println("It's Monday"); break;
            case TUESDAY:
                System.out.println("It's Tuesday");break;

        }

        Day[] weekdays = Day.values();

        System.out.println(Arrays.toString(weekdays));
    }
}
