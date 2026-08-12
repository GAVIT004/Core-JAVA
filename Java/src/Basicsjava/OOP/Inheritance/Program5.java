package Basicsjava.OOP.Inheritance;

import java.util.Scanner;

class Person{
    protected String name;
    protected int age;

    void displayRole(){
        System.out.println("Person role ");
    }
}

class Student extends Person{
    @Override
    void displayRole(){
        System.out.println("This person is student");
    }
}
class Teacher extends  Person{
    @Override
    void displayRole(){
        System.out.println("This person is teachear");
    }
}
class Principal extends Person{
    @Override
    void displayRole(){
        System.out.println("This person is Principal");
    }

}
public class Program5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Person person=new Person();
        System.out.println("Enter a person name: ");
        person.name=scanner.nextLine();
        System.out.println("Enter a person age: ");
        person.age=scanner.nextInt();
        person.displayRole();
        person=new Student();
        person.displayRole();
        person=new Teacher();
        person.displayRole();
        person=new Principal();
        person.displayRole();

    }
}
