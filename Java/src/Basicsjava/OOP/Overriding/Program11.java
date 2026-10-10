package Basicsjava.OOP.Overriding;

class Parent10{

    int x=888;
}

class Child10 extends Parent10{

    int x=999;
}

public class Program11 {

    public static void main(String[] args) {

        Parent10 parent10=new Parent10();
        System.out.println(parent10.x);

        Child10 child10=new Child10();
        System.out.println(child10.x);

        Parent10 parent10_1=new Child10();
        System.out.println(parent10_1.x);
    }
}
