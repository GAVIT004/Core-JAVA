package Basicsjava;

import java.util.Scanner;

class EmplooyeDetail{
    String empName;
    int empId;
    double monthlySalary;

    EmplooyeDetail(String name,int id,double salary){
        empName=name;
        empId=id;
        monthlySalary=salary;

    }



    void displayEmp(){
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Id: "+empId);
        System.out.println("Employee monthly salary: "+monthlySalary);

    }

    double annualSalary(){
        return monthlySalary*12;
    }

    void bonus(){
        if(monthlySalary>=50000){
            System.out.println("Bonus = 10000");
            double totalSal=monthlySalary+10000;
            System.out.println("Total Annual Salary: "+totalSal);

        }else {
            System.out.println("Bonus = 5000");
            double totalSal=monthlySalary+5000;
            System.out.println("Total Annual Salary: "+totalSal);
        }

    }
}
public class Practiceprog7 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("____Enter a employee detail____");
        System.out.println("Enter a employee name: ");
        String name=scanner.next();
        System.out.println("Enter a employee Id: ");
        int id=scanner.nextInt();
        System.out.println("Enter a employee monthly salary: ");
        double salary=scanner.nextDouble();
        EmplooyeDetail emplooyeDetail=new EmplooyeDetail(name,id,salary);
        emplooyeDetail.displayEmp();
        System.out.println("Employee annual salary:"+emplooyeDetail.annualSalary());
        emplooyeDetail.bonus();



    }
}
