package Basicsjava.ExceptionHandling.CustomizedExceptionHandling;

public class Program1 {

    public static void main(String[] args) {

       /* System.out.println("Statement 1");
        System.out.println(10/0);
        System.out.println("Statement 3");
        Statement 1
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Basicsjava.ExceptionHandling.CustomizedExceptionHandling.Program1.main(Program1.java:8)

*/

        System.out.println("Statement 1");
        try {
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){
            System.out.println(10/2);
        }
        System.out.println("Statement 3");
    }
}
