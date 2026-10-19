package Basicsjava.ExceptionHandling.CustomizedExceptionHandling;

public class Program3 {

    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        }catch (Exception exception){
            System.out.println(10/2);
        }/*catch (ArithmeticException arithmeticException){
            //Exception 'java.lang.ArithmeticException' has already been caught
        }*/
    }
}
