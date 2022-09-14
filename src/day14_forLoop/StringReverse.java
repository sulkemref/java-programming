package day14_forLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Cydeo school",
                result = "";
        //            0123

        System.out.println(reverse(str));

        System.out.println("-------------------------------------------------");

        String name = "Ermek Keneshbekovich Apazov";

        result = reverse(name);

        System.out.println(result);
    }

    public static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }

}
