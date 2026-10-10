package Basicsjava.OOP.Static;

public class SCFParentToChildRelation {

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

class Derived extends SCFParentToChildRelation{

    static int num3=100;

    static {

        method2();
        System.out.println("Derive first static block");
    }

    public static void main(String[] args) {

        method2();
        System.out.println("Derive main");
    }

    public static void method2(){
        System.out.println(num4);
    }

    static {
        System.out.println("Derived second static block");
    }

    static int num4=200;
}
