package Basicsjava.ExceptionHandling.CustomizedExceptionHandling;

public class Program9 {

    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            int a=10;
            int b=0;

            int result=a/b;
        }catch (ArithmeticException arithmeticException){
            System.out.println("Error: Cannot divide by zero");
        }finally {
            System.out.println("Finally block always executed");
        }

        System.out.println("Program ends");
    }
}
