package Basicsjava;

class Animal{
    void eat(){
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("A dog is barking...");
    }
}


public class Inheritanceprog1 {
    public static void main(String[]args){
        Dog d=new Dog();
        d.eat();
        d.bark();

    }
}
