package Basicsjava.MainMethod;

public class Program9 {

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Main() method");
    }

    /* In 1.6 version
            O/P: Static block
                 Main() method
    */

    /* In 1.7 Version
             O/P: Static block
                 Main() method
    */
}
