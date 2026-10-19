package Basicsjava.ExceptionHandling.CustomizedExceptionHandling;

public class Program6 {

    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){

        }
        /*catch (ArithmeticException arithmeticException){
            'catch' branch identical to 'ArithmeticException' branch
        }*/
    }
}
