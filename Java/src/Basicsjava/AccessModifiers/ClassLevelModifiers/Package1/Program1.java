package Basicsjava.AccessModifiers.ClassLevelModifiers.Package1;


import Basicsjava.AccessModifiers.ClassLevelModifiers.Pakage1Class;

public class Program1 extends Pakage1Class {

    public static void main(String[] args) {

        Pakage1Class package1Class=new Pakage1Class();
        package1Class.method1();
    }
/*
    Basicsjava.AccessModifiers.ClassLevelModifiers.Pakage1Class is not public in Basicsjava.AccessModifiers.ClassLevelModifiers; cannot be accessed from outside package
    Basicsjava.AccessModifiers.ClassLevelModifiers.Pakage1Class is not public in Basicsjava.AccessModifiers.ClassLevelModifiers; cannot be accessed from outside package
    Basicsjava.AccessModifiers.ClassLevelModifiers.Pakage1Class is not public in Basicsjava.AccessModifiers.ClassLevelModifiers; cannot be accessed from outside package
    Basicsjava.AccessModifiers.ClassLevelModifiers.Pakage1Class is not public in Basicsjava.AccessModifiers.ClassLevelModifiers; cannot be accessed from outside package*/

}
