package day08_ternaries_switch;

public class SwitchIntro {

    public static void main(String[] args) {

        char grade = 'A';

        String result = "";

        if (grade == 'A') {
            result = "Excellent";
        }
        else if (grade == 'B') {
            result = "Great job";
        }
        else if (grade == 'C') {
            result = "Good";
        }
        else if (grade == 'D') {
            result = "Passed";
        }
        else {
            result = "Failed";
        }
        System.out.println(result);

        System.out.println("--------------------------------------------------------");

        grade = 'Q';

        result = "";

        switch(grade){

            case 'A':
                result = "Excellent";
                break;

            case 'B':
                result = "Great Job";
                break;

            case 'C':
                result = "Good";
                break;

            case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";
                break;

        }

        System.out.println(result);

    }
}
