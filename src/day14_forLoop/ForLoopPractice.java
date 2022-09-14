package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

      // for(;;){ infinity loop
        for(int i = 10; i>=5;i--){
            System.out.println("Hello Cydeo "+i);

        }

      //  System.out.println("Hello world");

        System.out.println("---------------------------------------------------");

        int a=0;

        for(int i=1; i<101;i++){
            a+=i;
            //System.out.println(i +" "+ a);
        }
        System.out.println(a);

        System.out.println("---------------------------------------------------");

        int n=0;

        for(char i='A';i<='Z';i++) {

            System.out.print(i+" ");

            n++;
            if(n%9==0){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("---------------------------------------------------");

        n=0;

        for(char i='Z';i>='A';i--) {

            System.out.print(i+" ");

            n++;
            if(n%9==0){
                System.out.println();
            }
        }

    }
}

/*


 */