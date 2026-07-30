package Basicsjava.OOP.Inheritance.MultilevelInheritance;

import java.util.Scanner;

class Persons{
    String personName;
    int personAge;

    void acceptPerson(String name,int age){
        personName=name;
        personAge=age;
    }
    void displayPerson(){
        System.out.println("Person Name: "+personName);
        System.out.println("Person Age: "+personAge);
    }
}
class Employees extends Persons{
    int empId;
    double empBasicSalary;
    void acceptEmplyoee(int id,double salary){
        empId=id;
        empBasicSalary=salary;
    }
    void displayEmplyoee(){
        System.out.println("Emplyoee id: "+empId);
        System.out.println("Emplyoee basic salary: "+empBasicSalary);
    }
}
class Developers extends Employees{
    String projectName;
    double bonus;
    void acceptDevelopers(String project,double bonuss){
        projectName=project;
        bonus=bonuss;
    }
    void displayDeveloper(){
        System.out.println("Project Name: "+projectName);
        System.out.println("Bonus: "+bonus);
    }
    void calculateSalary(double bonus){
        empBasicSalary=empBasicSalary+bonus;
        System.out.println("Emplyoee total salary: "+empBasicSalary);
    }
}
public class Program1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Developers developers=new Developers();
        System.out.print("Enter a person name: ");
        String name=scanner.nextLine();
        System.out.print("Enter a person age:");
        int age=scanner.nextInt();
        developers.acceptPerson(name,age);
        developers.displayPerson();
        System.out.print("Enter a emplyoee id:");
        int id=scanner.nextInt();
        System.out.print("Enter a emplyoee basic salary:");
        double salary=scanner.nextDouble();
        developers.acceptEmplyoee(id,salary);
        developers.displayEmplyoee();
        System.out.print("Enter a project Name:");
        String project=scanner.next();
        System.out.print("Enter a  bonus:");
        double bonus=scanner.nextDouble();
        developers.acceptDevelopers(project,bonus);
        developers.displayDeveloper();
        developers.calculateSalary(bonus);


    }
}
