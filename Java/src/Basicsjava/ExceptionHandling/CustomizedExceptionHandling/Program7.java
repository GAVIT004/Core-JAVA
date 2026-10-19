package Basicsjava.ExceptionHandling.CustomizedExceptionHandling;

public class Program7 {

    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){

        }finally {
            System.out.println("finally");
        }

    }
}
