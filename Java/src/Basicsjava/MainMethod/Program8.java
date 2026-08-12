package Basicsjava.MainMethod;

public class Program8 {
    static {
        System.out.println("Static block");
        System.exit(0);
    }

    /* In 1.6 version
            O/P: Static block

    */

    /* In 1.7 Version
            O/P: Error: main method not fount in class className
    */
}
