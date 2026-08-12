package Basicsjava.Variables.InstanceVariables;

import java.util.Scanner;

class Employee{
    int empId;
    String empName;
    double basicSalary;

    void getEmployee(int id,String name,double salary){
        empId=id;
        empName=name;
        basicSalary=salary;
    }

    double grossSalary;
    double hra;
    double da;

    void calculateSalary(){
       hra=(basicSalary*20)/100;
       da=(basicSalary*10)/100;
       grossSalary=basicSalary+hra+da;
    }

    void displayEmployee(){
        System.out.println("Employee id: "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee basic salary: "+basicSalary);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
        System.out.println("Gross salary: "+grossSalary);
    }
}
public class Program2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter number of employee: ");
        int empNum=scanner.nextInt();
        for (int i=0;i<empNum;i++){
            System.out.println("Enter a employee "+(1+i)+" detail");
            System.out.println("Enter a employee id: ");
            int id=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter a employee name: ");
            String name=scanner.nextLine();
            System.out.println("Enter a employee basic salary: ");
            double salary=scanner.nextDouble();
            Employee employee=new Employee();
            employee.getEmployee(id,name,salary);
            employee.calculateSalary();
            employee.displayEmployee();
        }
        scanner.close();
    }
}
