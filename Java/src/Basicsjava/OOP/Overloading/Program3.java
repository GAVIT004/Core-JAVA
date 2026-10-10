package Basicsjava.OOP.Overloading;

public class Program3 {

    public void method1(String string){
        System.out.println("String Version");
    }

    public void method1(Object object){
        System.out.println("Object Version");
    }

    public static void main(String[] args) {

        Program3 program3=new Program3();
        program3.method1(new Object());
        program3.method1("Java");
        program3.method1(null);
    }
}
