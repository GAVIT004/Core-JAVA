package Basicsjava.OOP.Instance;

public class ICFParentToChild {

    int num1=10;

    {

        method1();
        System.out.println("First Instance Block");
    }


    ICFParentToChild() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        InstanceControlFlow instanceControlFlow=new InstanceControlFlow();
        System.out.println("main");
    }

    public void method1(){
        System.out.println(num2);
    }

    {
        System.out.println("Second instance block");
    }

    int num2=20;
}

class Child extends ICFParentToChild{

    int num3=30;

    {
        method2();
        System.out.println("Child first instance block");
    }

    Child(){
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {

        Child child=new Child();
        System.out.println("Child main");
    }

    public void method2(){
        System.out.println(num4);
    }

    {
        System.out.println("Child second instance block");
    }

    int num4=40;
}
