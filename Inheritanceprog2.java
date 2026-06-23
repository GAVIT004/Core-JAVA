package Basicsjava;

import java.util.Scanner;

class PersonDetails{
    String personName;
    int personAge;

    PersonDetails(String name,int age){
        personName=name;
        personAge=age;
    }

    void displayPersonDetail(){
        System.out.println("Person Name: "+personName);
        System.out.println("Person Age: "+personAge);
    }
}

class EmpDetails extends PersonDetails{
    int empId;
    double empSalary;

    EmpDetails(String name,int age,int id,double sal){
        super(name,age);
        empId=id;
        empSalary=sal;

    }

    void displayemp(){
        System.out.println("Employee name: "+personName);
        System.out.println("Employee age"+personAge);
        System.out.println("Employee id: "+empId);
        System.out.println("Employee Salary: "+empSalary);
    }

}


public class Inheritanceprog2 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a person detail----");
        System.out.println("Enter a person name:");
        String name=scanner.next();
        System.out.println("Enter a person age: ");
        int age=scanner.nextInt();
        System.out.println("Enter a employee details----");
        System.out.println("Enter a employee Id: ");
        int id=scanner.nextInt();
        System.out.println("Enter a employee salary: ");
        double sal=scanner.nextDouble();

        EmpDetails emp=new EmpDetails(name,age,id,sal);
        emp.displayPersonDetail();
        emp.displayemp();


    }


}
