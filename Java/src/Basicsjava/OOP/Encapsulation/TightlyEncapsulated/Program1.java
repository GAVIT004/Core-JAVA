package Basicsjava.OOP.Encapsulation.TightlyEncapsulated;

public class Program1 {

    private int x=10;  //TightlyEncapsulated
}

class program1Child extends Program1{

    int y=20; //Not TightlyEncapsulated
}

class program1Child2 extends Program1{

    private int z=30;  //TightlyEncapsulated
}
