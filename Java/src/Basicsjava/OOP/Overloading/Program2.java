package Basicsjava.OOP.Overloading;

public class Program2 {

    public void method1(int i){
        System.out.println("Int-argument");
    }

    public void method1(float f){
        System.out.println("Float-argument");
    }

    public static void main(String[] args) {

        Program2 program2=new Program2();
        program2.method1(10);
        program2.method1(10.5f);
        program2.method1('a');
        program2.method1(10L);
       // program2.method1(10.5);     Cannot resolve method 'method1(double)'
    }
}
