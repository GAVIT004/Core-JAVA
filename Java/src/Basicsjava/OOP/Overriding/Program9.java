package Basicsjava.OOP.Overriding;

class Parent8{

    public static void method1(){

    }

    public void method2(){

    }

    public static void method3(){

    }
}

class Child8 extends Parent8{

  /*  public void method1(){
        Instance method 'method1()' in 'Basicsjava.OOP.Overriding.Child8' cannot override static method 'method1()' in 'Basicsjava.OOP.Overriding.Parent8'
    }*/

/*    public static void method2(){
        Static method 'method2()' in 'Basicsjava.OOP.Overriding.Child8' cannot override instance method 'method2()' in 'Basicsjava.OOP.Overriding.Parent8'
    }*/

    public static void method3(){

    }
}

public class Program9 {
}
