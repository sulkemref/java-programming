package utilities;

public class StringUtility {

    public static String reverse(String str) {
        String result = ""; // to contain all the characters of the giving string in reversed order

        for (int i = str.length() - 1; i >= 0; i--) { // i: index number of the give string starting from last index to index zero
            result += str.charAt(i);// to get each character of the string starting from last index to index zero
        }
        return result;
    }
}
