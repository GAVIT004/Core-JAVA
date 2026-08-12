package Basicsjava.OOP;


//Parent class
class Animal{
    void sound(){
        System.out.println("Animal make sounds");
    }
}

//child class
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meow");
    }
}

class Cow extends Animal{
    void sound(){
        System.out.println("Cow moos");
    }
}
public class Program1 {
    public static void main(String[] args){
        Animal animal=new Animal();
        animal.sound();
        animal=new Dog();
        animal.sound();
        animal=new Cat();
        animal.sound();
        animal=new Cow();
        animal.sound();

    }
}

