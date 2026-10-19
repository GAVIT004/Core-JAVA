package Basicsjava.ExceptionHandling.CustomizedExceptionHandling;

public class Program2 {

    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
            System.out.println(arithmeticException);
            System.out.println(arithmeticException.toString());
            System.out.println(arithmeticException.getMessage());
        }
    }
}
