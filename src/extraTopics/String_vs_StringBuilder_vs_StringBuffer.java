package extraTopics;

public class String_vs_StringBuilder_vs_StringBuffer {

    public static void main(String[] args) {


        String string = "Wooden";

        string = string.concat(" Spoon");// "Wooden Spoon"

        System.out.println(string);

        System.out.println("--------------------------------------------------------");

        StringBuilder stringBuilder = new StringBuilder("Wooden");
        stringBuilder.append(" Spoon");

        System.out.println(stringBuilder);

        System.out.println("--------------------------------------------------------");

        StringBuffer stringBuffer = new StringBuffer("Wooden");
        stringBuffer.append(" Spoon");

        System.out.println(stringBuffer);

    }
}
