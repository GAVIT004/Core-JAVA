package Basicsjava.OOP.Constructor;

import Basicsjava.OOP.Overloading.Program3;

public class Program1 {

    String name;
    int rollNumber;

    public Program1(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public static void main(String[] args) {

        Program1 program1=new Program1("Aditya",101);
        Program1 program2=new Program1("Ravi",102);
    }

}
