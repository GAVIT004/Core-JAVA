package Basicsjava.PracticeProblem.Day1;

import java.util.Scanner;

public class EmployeePayRoll {
    static int employeeId;
    static String employeeName;
    static int employeeAge;
    static  String employeeDepartment;
    static  String employeeJobTitle;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a company name: ");
        final String companyName=scanner.nextLine();
        System.out.println("Enter a employee department: ");
        employeeDepartment=scanner.next();
        scanner.nextLine();
        System.out.println("Enter a employee job title: ");
        employeeJobTitle=scanner.nextLine();
        System.out.println("Enter a employee ID: ");
        employeeId=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a employee name: ");
        employeeName=scanner.nextLine();
        System.out.println("Enter a employee age: ");
        employeeAge=scanner.nextInt();
        System.out.println("Enter a employee gender: ");
        final String employeeGender=scanner.next().trim();

        double basicSalary;
        double HRA;
        double DA;
        double bonus;
        double taxDeduction;

        System.out.println("Enter a employee basic salary: ");
        basicSalary=scanner.nextDouble();
        System.out.println("Enter a HRA: ");
        HRA=scanner.nextDouble();
        System.out.println("Enter a DA: ");
        DA=scanner.nextDouble();
        System.out.println("Enter a bonus: ");
        bonus=scanner.nextDouble();
        System.out.println("Enter a total tax: ");
        taxDeduction=scanner.nextDouble();

        double grossSalary=basicSalary+HRA+DA+bonus;
        double netSalary=grossSalary-taxDeduction;

        System.out.println("Company Name: "+companyName);
        System.out.println("Department: "+employeeDepartment);
        System.out.println("Job title: "+employeeJobTitle);
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Age: "+employeeAge);
        System.out.println("Employee Gender: "+employeeGender);
        System.out.println("Employee basic salary: "+basicSalary);
        System.out.println("HRA: "+HRA);
        System.out.println("DA: "+DA);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total tax deduction: "+taxDeduction);
        System.out.println("Employee Gross Salary: "+grossSalary);
        System.out.println("Employee Net Salary: "+netSalary);

        scanner.close();

    }
}
