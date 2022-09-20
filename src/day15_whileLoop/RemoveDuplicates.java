package day15_whileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aaaaaaaaaabbbbbbbffffffffffiiiiiiiiiirrrrrfffffff",result ="";
/*
        result+=str.charAt(0);

        for (int i = 1; i < str.length()-1; i++) {
            if(str.charAt(i)!=str.charAt(i+1)){
                result+=str.charAt(i+1);
            }else{
                result+="";
            }
        }
        System.out.println(result);
 */

        for (int i = 0; i < str.length(); i++) {


            char each = str.charAt(i);

            if(!result.contains(each+"")){
                result+=each;
            }

        }
        System.out.println(result);
    }
}

/*
3. Write a program that can remove the duplicated characters from the a string

        Ex:
        str = "aabbbcccc"

        output:
        abc

 */