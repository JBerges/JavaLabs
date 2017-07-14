package javalabs.lang.covariantreturn;

/**
 * This labs explores covariant return type in Java.
 *
 * Take a look at Dog.seekFood() comments for details
 *
 * More info :
 * - https://en.wikipedia.org/wiki/Covariant_return_type
 * - https://blogs.oracle.com/sundararajan/covariant-return-types-in-java
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("seekFood for Animal");
        new Animal().seekFood();

        System.out.println("seekFood for Dog");
        new Dog().seekFood();
    }
}
