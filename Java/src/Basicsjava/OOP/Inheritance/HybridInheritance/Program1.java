package Basicsjava.OOP.Inheritance.HybridInheritance;

import java.util.Scanner;

class Person{
    String personName;
    int personAge;

    void getPerson(String name,int age){
        personName=name;
        personAge=age;
    }

    void displayPerson(){
        System.out.println("Person Name: "+personName);
        System.out.println("Person Age: "+personAge);
    }
}

interface Attendance{
    default void markAttendance() {

    }
}

interface Salary{
    default void calculateSalary(){

    }
}

class Employee extends Person implements Attendance,Salary{
    int empid;
    double salaryPerDay;
    int workingDays;

    void getEmployee(int id,double salary,int work){
        empid=id;
        salaryPerDay=salary;
        workingDays=work;
    }

    void displayEmployee(){
        System.out.println("Employee id: "+empid);
        System.out.println("Salary per day: "+salaryPerDay);
        System.out.println("Working days: "+workingDays);
    }

    @Override
    public void markAttendance(){
        System.out.println("Attendance mark successfully");
        System.out.println("Total working days: "+workingDays);
    }

    @Override
    public void calculateSalary(){
        double monthlySalary=salaryPerDay*workingDays;
        System.out.println("Monthly Salary: "+monthlySalary);
    }
}
public class Program1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a person name:");
        String name=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter a person age:");
        int age=scanner.nextInt();
        System.out.println("Enter employee id: ");
        int id=scanner.nextInt();
        System.out.println("Enter salary per day: ");
        double salary=scanner.nextDouble();
        System.out.println("Enter working days: ");
        int work=scanner.nextInt();
        Employee employee=new Employee();
        employee.getPerson(name,age);
        employee.getEmployee(id,salary,work);
        employee.displayPerson();
        employee.displayEmployee();
        employee.markAttendance();
        employee.calculateSalary();
        scanner.close();
    }
}
