package Basicsjava.OOP.Inheritance.SingleInheritance;
class Employee{
    void login(){
        System.out.println("Employee is login....");
    }
}
class Developer extends Employee{
    void writeCde(){
        System.out.println("Developer writing a code");
    }
}
public class Program4 {
    public static void main(String[] args){
        Developer developer=new Developer();
        developer.login();
        developer.writeCde();
    }

}
