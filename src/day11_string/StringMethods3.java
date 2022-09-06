package day11_string;

public class StringMethods3 {

    public static void main(String[] args) {

        String word = "Java";

        boolean r1= word.isEmpty();

        System.out.println(r1);


        System.out.println("-----------------------------------------------");

        String str = "       ";

        boolean r3 = str.isBlank();
        boolean r2= str.isEmpty();

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("-----------------------------------------------");

        String str1 = "Cydeo";

        String str2 = new String("Cydeo");

        System.out.println(str1.equals(str2));

        String str3 = new String("cydeo");

        System.out.println(str2.equals(str3));

        System.out.println("-----------------------------------------------");

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s2.equalsIgnoreCase(s2));//true

        System.out.println("-----------------------------------------------");

        String students = "Hasan Naran Sumeye Nataliia";

        boolean hasAhmed = students.contains("Ahmed");

        System.out.println("hasAhmed = " + hasAhmed);

        String sentence = "My favorite programming language is JAVA";

        boolean hasJava = sentence. toLowerCase().contains("java");

        System.out.println("hasJava = " + hasJava);

        System.out.println("-----------------------------------------------");

        String name = "Michal";
        boolean l = name.startsWith("Da");

        System.out.println("l = " + l);

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");

        System.out.println("isValid = " + isValid);

        boolean t = url.endsWith(".com");

        System.out.println("t = " + t);

        System.out.println("-----------------------------------------------");

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotMail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotMail = " + isHotMail);





    }
}
