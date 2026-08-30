package Basicsjava.AccessModifiers.MemberLevelModifiers.StaticModifier;

public class Program3 {

    public static void main(String[] args) {

        System.out.println("Parent main");
    }
}

class Child extends Program3{

    public static void main(String[] args) {

        System.out.println("Child main");
    }
}
