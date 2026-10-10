package Basicsjava.OOP.Overloading;

public class Program6 {

    public void method1(int x){
        System.out.println("General");
    }

    public void method1(int...x){
        System.out.println("Var-arg method");
    }

    public static void main(String[] args) {

        Program6 program6=new Program6();
        program6.method1();
        program6.method1(10,20,30,40);
        program6.method1(10);
    }
}
