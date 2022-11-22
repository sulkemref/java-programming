package day34_abstraction.animalTask;

public interface Playable {

    public static final boolean isFriendly = true; // static & final

    /*
    public static void main(String[] args) {

        // isFriendly = false;

        System.out.println(isFriendly);

    }

    default void method1(){

    }
*/

    void play(); //abstract

}
