package Basicsjava.OOP.Overriding;

import java.io.EOFException;
import java.io.IOException;

class Parent7{

    public void method1() throws IOException{

    }
}

class Child7 extends Parent7{

/*    public void method1() throws EOFException,InterruptedException{
        'method1()' in 'Basicsjava.OOP.Overriding.Child7' clashes with 'method1()' in 'Basicsjava.OOP.Overriding.Parent7'; overridden method does not throw 'java.lang.InterruptedException'
    }*/
}

public class Program8 {
}
