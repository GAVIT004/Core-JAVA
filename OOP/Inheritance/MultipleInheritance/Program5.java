package Basicsjava.OOP.Inheritance.MultipleInheritance;

import java.util.Scanner;

interface Attendance{
    default void attendanceMark(){
    }

    void  attendanceMar();
}

interface Salary{
    default void calculateSalary(){
    }
}

class Emplyoee implements Attendance,Salary{
    int empId;
    String empName;
    double salaryPerDay;
    int workingDays;

    void getEmplyoee(int id,String name,double salary,int work){
        empId=id;
        empName=name;
        salaryPerDay=salary;
        workingDays=work;
    }

    void displayEmplyoee(){
        System.out.println("Emplyooe ID: "+empId);
        System.out.println("Emplyoee Name: "+empName);
        System.out.println("Emplyooe Salary per day: "+salaryPerDay);
        System.out.println("Emplyooe working days: "+workingDays);
    }

    @Override
    public void  attendanceMar(){
        System.out.println("Attendance marked successfully ");
        System.out.println("Total working days: "+workingDays);
    }

    @Override
    public void calculateSalary(){
        double monthlySalary=salaryPerDay*workingDays;
        System.out.println("Emplyoee monthly salary: "+monthlySalary);
    }
}
public class Program5 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter emplyooe id: ");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter emplyooe name: ");
        String name=scanner.nextLine();
        System.out.println("Enter emplyooe salary per day: ");
        double salary=scanner.nextDouble();
        System.out.println("Enter emplyooe working days: ");
        int work=scanner.nextInt();
        Emplyoee emplyoee=new Emplyoee();
        emplyoee.getEmplyoee(id,name,salary,work);
        emplyoee.displayEmplyoee();
        emplyoee.attendanceMar();
        emplyoee.calculateSalary();
    }
}
