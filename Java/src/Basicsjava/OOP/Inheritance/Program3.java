package Basicsjava.OOP.Inheritance;

import java.util.Scanner;

class Employee{
    protected int empId;
    protected String empName;

    void setEmplyooe(int id,String name){
        empId=id;
        empName=name;
    }


    void work(){
        System.out.println("Employee role based work");
    }
}

class Developer extends Employee{
    @Override
    void work(){
        System.out.println(empId+" "+empName+" Developer writes a code");

    }
}

class Tester extends Employee{
    @Override
    void work(){
        System.out.println(empId+" "+empName+" Tester test  a code");

    }
}

class Manager extends Employee{
    @Override
    void work(){
        System.out.println(empId+" "+empName+" Manager manage a team");

    }
}
public class Program3 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a employee id:");
        int id=scanner.nextInt();
        System.out.println("Enter a employee name:");
        String name=scanner.next();
        Employee employee=new Employee();
        employee.setEmplyooe(id,name);
        employee.work();
        employee=new Developer();
        employee.setEmplyooe(id,name);
        employee.work();
        employee=new Tester();
        employee.setEmplyooe(id,name);
        employee.work();
        employee=new Manager();
        employee.setEmplyooe(id,name);
        employee.work();

    }
}
