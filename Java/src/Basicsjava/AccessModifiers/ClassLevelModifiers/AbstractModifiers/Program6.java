package Basicsjava.AccessModifiers.ClassLevelModifiers.AbstractModifiers;

/*
abstract class Program{

    public abstract void m1();
    public abstract void m2();
}
public class Program6 extends Program{

    public void m1(){
        System.out.println("m1");
    }

    Class 'Program6' must either be declared abstract or implement abstract method 'm2()' in 'Program
}
*/


abstract  class Program{

    public abstract void m1();
    public abstract void m2();
}

public class Program6 {

    public void m1(){
        System.out.println("m1");
    }

    public void m2(){
        System.out.println("m2");
    }

    public static void main(String[] args) {

        Program6 program6=new Program6();
        program6.m1();
        program6.m2();
    }
}