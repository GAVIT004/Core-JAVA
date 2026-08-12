package Basicsjava.PracticeProblem.Day1;

import java.util.Scanner;

public class EmployeeSalaryAnalyzer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a employee name: ");
        String employeeName=scanner.nextLine();
        System.out.println("Enter a employee id: ");
        int employeeId=scanner.nextInt();
        System.out.println("Enter a employee basic salary: ");
        double basicSalary=scanner.nextDouble();
        System.out.println("Enter a bonus amount: ");
        double bonus=scanner.nextDouble();
        System.out.println("Enter a total tax deduction amount: ");
        double taxDeduction=scanner.nextDouble();
        System.out.println("Enter a total working days: ");
        int workingDays=scanner.nextInt();
        System.out.println("Enter a present days: ");
        int presentDays=scanner.nextInt();

        double totalSalary=basicSalary+bonus;
        double salaryTax=totalSalary-taxDeduction;
        double doubleBonus=bonus*2;
        double halfBonus=bonus/2;
        double sal=totalSalary%1000;

        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Employee basic salary: "+basicSalary);
        System.out.println("Bonus: "+bonus);
        System.out.println("Tax amount: "+taxDeduction);
        System.out.println("Working days: "+workingDays);
        System.out.println("Present days: "+presentDays);
        System.out.println("Total salary: "+totalSalary);
        System.out.println("Salary after tax: "+salaryTax);
        System.out.println("Double Bonus: "+doubleBonus);
        System.out.println("Half Bonus: "+halfBonus);
        System.out.println("Salary disible by 1000 remaing"+sal);

        System.out.println("Working Days: "+workingDays);
        workingDays++;
        System.out.println("after increment: "+workingDays);
        System.out.println("Present Days: "+presentDays);
        presentDays--;
        System.out.println("after dcrement: "+presentDays);

        System.out.println("Salary after tax: "+salaryTax);
        salaryTax+=doubleBonus;
        System.out.println("Salary after double bonus: "+salaryTax);
        salaryTax-=halfBonus;
        System.out.println("Final salary: "+salaryTax);
        salaryTax*=sal;
        System.out.println("Final salary Increment: "+salaryTax);
        salaryTax/=12;
        System.out.println("Monthly salary: "+salaryTax);
        salaryTax%=100;
        System.out.println("Monthly salay after divisible by 100 remender: "+salaryTax);

        boolean isSalary=salaryTax>taxDeduction;
        System.out.println(isSalary);
        isSalary=salaryTax==bonus;
        System.out.println(isSalary);
        boolean isWorkingDays=workingDays>presentDays;
        System.out.println(isWorkingDays);
        isSalary=salaryTax!=bonus;
        System.out.println(isSalary);

        isSalary=salaryTax>=200000&&presentDays>=90;
        System.out.println(isSalary);

        String isBonus=(salaryTax>=50000)?"Bonus is eligible":"No Bonus";
        System.out.println(isBonus);
    }
}
