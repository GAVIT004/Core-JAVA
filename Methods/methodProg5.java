package Basicsjava.Methods;

import java.util.Scanner;

class Employee{
    String empName;
    int empId;
    double salary;

    void acceptEmpData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a employee name: ");
        empName=sc.next();
        System.out.println("Enter a employee Id: ");
        empId=sc.nextInt();
        System.out.println("Enter a employee salary: ");
        salary=sc.nextDouble();
    }

    void displayEmpData(){
        System.out.println(" Employee name: "+empName);
        System.out.println(" Employee Id: "+empId);
        System.out.println(" Employee salary: "+salary);
    }

    double annualSalary(){
        return salary*12;
    }

    double bonus(double amount){
        amount=5000;
        if(salary>50000){
            System.out.println(salary);
        }
        return salary+amount;
    }


}

public class methodProg5 {
    public static void main(String[]args){
        Employee emp=new Employee();
        emp.acceptEmpData();
        emp.displayEmpData();
        System.out.println("Employee annual salary: "+emp.annualSalary());
        System.out.println("Bonus: "+emp.bonus(emp.salary));
    }


}
