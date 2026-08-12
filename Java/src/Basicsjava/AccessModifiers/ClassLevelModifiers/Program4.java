package Basicsjava.AccessModifiers.ClassLevelModifiers;

class Aditya{
    void display(){
        System.out.println("Hello");
    }
}

public class Program4 {
    public static void main(String[] args) {
        Aditya aditya=new Aditya();
        aditya.display();
    }
}
