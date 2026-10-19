package Basicsjava.ExceptionHandling.CustomizedExceptionHandling;

public class Program13 {

    public static void main(String[] args) {

        /*System.out.println(10/0);
        System.out.println("Java");
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Basicsjava.ExceptionHandling.CustomizedExceptionHandling.Program13.main(Program13.java:7)*/

        throw  new ArithmeticException("/ by zero");
        //System.out.println("java"); Unreachable statement
    }
}
