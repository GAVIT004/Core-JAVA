package Basicsjava.ExceptionHandling.CustomizedExceptionHandling;

public class Program8 {

    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        }finally {
            System.out.println("Finally");
        }
    }
}
