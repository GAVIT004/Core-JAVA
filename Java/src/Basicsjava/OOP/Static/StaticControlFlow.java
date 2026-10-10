package Basicsjava.OOP.Static;

public class StaticControlFlow {

    static  int num1=10;

    static {

        method1();
        System.out.println("First static block");
    }

    public static void main(String[] args) {

        method1();
        System.out.println("Main method");
    }

    public static void method1(){
        System.out.println(num2);
    }

    static {

        System.out.println("Second static block");
    }

    static int num2=20;
}
