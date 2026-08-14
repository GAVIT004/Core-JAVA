package Basicsjava.OOP.Inheritance.SingleInheritance;
class Person{
    void walk(){
        System.out.println("Person is walking....");
    }
}
class Student extends Person{
    void study(){
        System.out.println("Student is studying");
    }
}
public class Program3 {
    public static void main(String[] args){
        Student student=new Student();
        student.walk();
        student.study();
    }
}
