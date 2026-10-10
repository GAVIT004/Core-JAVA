package Basicsjava.OOP.Overloading;

public class Program1 {

    public void method1(){
        System.out.println("No-argument");
    }

    public void method1(int i){
        System.out.println("Int-argument");
    }

    public void method1(String s){
        System.out.println("String-argument");
    }

    public static void main(String[] args) {

        Program1 program1=new Program1();
        program1.method1();
        program1.method1(10);
        program1.method1("Java");
    }
}
