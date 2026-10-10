package Basicsjava.OOP.Overriding;

class Parent9{

    public void method1(int...x){
        System.out.println("Parent var-arg method");
    }
}

class Child9 extends Parent9{

    public void method1(int x){
        System.out.println("Child int method");
    }
}

public class Program10 {

    public static void main(String[] args) {

        Parent9 parent9=new Parent9();
        parent9.method1(10);

        Child9 child9=new Child9();
        child9.method1(10);

        Parent9 parent9_1=new Child9();
        parent9_1.method1(10);
    }
}
