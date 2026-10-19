package Basicsjava.ExceptionHandling.CustomizedExceptionHandling;

/*public class Program14 {

    *//*public static void main(String[] args) {
        throw new Program14();
        Required type:
        Throwable
        Provided:
        Program14
    }*//*
}*/

public class Program14 extends RuntimeException{

    public static void main(String[] args) {

        throw new Program14();
    }
}
