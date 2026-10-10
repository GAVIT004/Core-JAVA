package Basicsjava.OOP.Encapsulation.TightlyEncapsulated;

public class Program2 {

    int x=10;   //Not TightlyEncapsulated
}

class Program2child extends Program2{

    private int y=20;   //Not TightlyEncapsulated
}

class Program2child2 extends Program2child{

    private int z=30;   //Not TightlyEncapsulated
}
