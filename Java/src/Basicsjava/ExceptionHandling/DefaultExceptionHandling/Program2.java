package Basicsjava.ExceptionHandling.DefaultExceptionHandling;

public class Program2 {

    public static void main(String[] args) {
        doStuff();
        System.out.println(10/0);
    }

    public static void doStuff(){
        doMoreStuff();
        System.out.println("Java");
    }

    public static void doMoreStuff(){

        System.out.println("Hello java");
    }
}
