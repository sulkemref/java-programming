package day21_multiDimensionalArray;

public class Task02 {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silenn";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();


        int count = 0;

        for (int i = 0; i < ch1.length; i++) {
           if(ch1.length!=ch2.length){
               break;
           }
            for (int j = 0; j < ch2.length; j++) {
                if(ch1[i]==ch2[j]){
                    count++;
                    ch2[j]='*';
                    ch1[i]='+';
                }
            }
        }
        System.out.println(count==ch1.length);

    }
}
