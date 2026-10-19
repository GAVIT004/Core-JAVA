package Basicsjava.ExceptionHandling.CustomizedExceptionHandling;

public class Program5 {

    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){
            System.out.println(10/2);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
