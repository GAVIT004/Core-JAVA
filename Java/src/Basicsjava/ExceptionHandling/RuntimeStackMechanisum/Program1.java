package Basicsjava.ExceptionHandling.RuntimeStackMechanisum;

public class Program1 {

    public static void main(String[] args) {

        doStuff();
    }

    public static void doStuff(){

        doMoreStuff();
    }

    public static void doMoreStuff(){

        System.out.println("Java");
    }
}
