package Basicsjava.MainMethod;

public class Program7 {
    static {
        System.out.println("Static block");
    }

    /* In 1.6 version
            O/P: Static block
                 RE:NoSuchMethodError:main
    */

    /* In 1.7 Version
            O/P: Error: main method not fount in class className
    */
}
