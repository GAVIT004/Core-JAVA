package Basicsjava.OOP.Instance;

public class InstanceControlFlow {

    int num1=10;

    {

        method1();
        System.out.println("First Instance Block");
    }


    public InstanceControlFlow() {
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
