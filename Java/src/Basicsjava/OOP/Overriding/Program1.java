package Basicsjava.OOP.Overriding;

import Basicsjava.OOP.MethodSignature.Program;

class Parent{

    public void property(){
        System.out.println("Cash+Land+Gold");
    }

    public void marry(){
        System.out.println("SubhaLaxmi");
    }
}

class Child extends Parent{

    @Override
    public void marry(){
        System.out.println("Isha");
    }
}

public class Program1 {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.marry();

        Child child = new Child();
        child.marry();

        Parent parent1 = new Parent();
        parent1.marry();
    }
}
