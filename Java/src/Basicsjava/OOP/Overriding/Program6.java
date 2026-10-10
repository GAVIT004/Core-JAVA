package Basicsjava.OOP.Overriding;

class Parent5{

    public void method1(){

    }
}

abstract class Child5 extends Parent5{

    @Override
    abstract public void method1();
}

public class Program6 extends Child5{

    @Override
    public void method1() {

    }
}
