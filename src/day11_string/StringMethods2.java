package day11_string;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python","Java");

        System.out.println(sentence);

        System.out.println("-------------------------------------------------");

        String word = "java";

        //word = word.replace('a','e'); // "jeve"
        word = word.replace("a","e"); // "jeve"
        System.out.println(word);

        System.out.println("-------------------------------------------------");

        String sentence2= "I love Java, Java is cool";

        //sentence2 = sentence2.replace("Java", "Python");

        sentence2 = sentence2.replaceFirst("Java", "Python");

        System.out.println(sentence2);

        System.out.println("-------------------------------------------------");

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        //sentence3 = sentence3.replace("Java", "Python");
        sentence3 = sentence3.replaceFirst(", Java", ", Python");

        System.out.println(sentence3);


        System.out.println("-------------------------------------------------");


        String sentence4 = "I love Java Programming";

        String languageName = sentence4.substring(7, 10+1);

        System.out.println(languageName);


        System.out.println("-------------------------------------------------");

        String sentence5 = "Today is Sunday, Tomorrow is Monday";

        String today = sentence5.substring(9,14+1);

        System.out.println(today);


        System.out.println("-------------------------------------------------");

        String email = "CydeoSchoolJavaProgramming@yandex.ru";

        int beginning = email.indexOf('@') + 1;
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);

        System.out.println(domain);

        System.out.println("-------------------------------------------------");

        String sentence6 = "I love Java programming";

        //String r1 = sentence6.substring(7, sentence6.length());

        String r1 = sentence6.substring(7);

        System.out.println(r1);

        System.out.println("-------------------------------------------------");

        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tommorow = sentence7.substring(sentence7.lastIndexOf(' ')+1);

        System.out.println(tommorow);

        System.out.println("-------------------------------------------------");

        String str = "Python";

        String result = (str+"\n").repeat(10);

        System.out.println(result);




    }
}
