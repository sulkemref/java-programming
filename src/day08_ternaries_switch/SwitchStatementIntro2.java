package day08_ternaries_switch;

public class SwitchStatementIntro2 {

    public static void main(String[] args) {

        int n = 2;

        String day = "";

        switch(n){

            case 1: day = "Monday";break;
            case 2: day = "Tuesday";break;
            case 3: day = "Wednesday";break;
            case 4: day = "Thursday";break;
            case 5: day = "Friday";break;
            case 6: day= "Saturday";break;
            case 7: day = "Sunday";break;
            default: day = "Invalid";
        }

        System.out.println(day);

    }
}

