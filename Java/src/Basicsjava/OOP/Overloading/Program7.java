package Basicsjava.OOP.Overloading;

class Animal{

}

class Monkey extends Animal{

}

public class Program7 {

    public void method1(Animal animal){
        System.out.println("Animal");
    }

    public void method1(Monkey monkey){
        System.out.println("Monkey");
    }

    public static void main(String[] args) {

        Program7 program7=new Program7();

        Animal animal=new Animal();
        program7.method1(animal);

        Monkey monkey=new Monkey();
        program7.method1(monkey);

        Animal animal1=new Monkey();
        program7.method1(animal1);
    }

}
