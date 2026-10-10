package Basicsjava.OOP.MethodHiding;

class Parent{

    public static void method1(){
        System.out.println("Parent method1");
    }
}

class Child extends Parent{

    public static void method1(){
        System.out.println("Child method1");
    }
}

public class Program1 {

    public static void main(String[] args) {

        Parent parent=new Parent();
        parent.method1();

        Child child=new Child();
        child.method1();

        Parent parent1=new Child();
        parent1.method1();
    }
}
