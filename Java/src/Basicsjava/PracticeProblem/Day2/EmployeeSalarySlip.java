package Basicsjava.PracticeProblem.Day2;

import java.util.Scanner;

class Employee{

    int employeeId;
    String employeeName;
    double employeeBasicSalary;
    static int numberOfWorkingDays=30;
    int numberOfDayEmployeePresent;

    public Employee(int employeeId, String employeeName, double employeeBasicSalary,int numberOfDayEmployeePresent) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBasicSalary = employeeBasicSalary;
        this.numberOfDayEmployeePresent=numberOfDayEmployeePresent;
    }

    double basicSalaryHRA;
    double basicSalaryDA;
    static  double conveyanceAllowance=1500;
    double grossSalary;
    double perDaySalary;
    double deductionSalary;
    double netSalary;
    int absentDays;

    public double calculateHRA(){
        basicSalaryHRA=employeeBasicSalary*20/100;
        return basicSalaryHRA;
    }

    public double calculateDA(){
        basicSalaryDA=employeeBasicSalary*10/100;
        return basicSalaryDA;
    }

    public double calculateGrossSalary(){
        grossSalary=employeeBasicSalary+calculateHRA()+calculateDA()+conveyanceAllowance;
        return grossSalary;
    }

    public double calculatePerDaySalary(){
        perDaySalary=calculateGrossSalary()/numberOfWorkingDays;
        return perDaySalary;
    }

    public double calculateDeductionSalary(){
        absentDays=numberOfWorkingDays-numberOfDayEmployeePresent;
        deductionSalary=calculatePerDaySalary()*absentDays;
        return deductionSalary;
    }

    public double calculateNetSalary(){
        netSalary=calculateGrossSalary()-calculateDeductionSalary();
        return netSalary;
    }
}

public class EmployeeSalarySlip {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int employeeId=scanner.nextInt();
        System.out.println("Enter Employee Name:");
        String employeeName= scanner.next();
        System.out.println("Enter Employee Basic Salary:");
        double employeeBasicSalary=scanner.nextDouble();
        System.out.println("Enter Employee Present Days: ");
        int numberOfDayEmployeePresent=scanner.nextInt();

        Employee employee=new Employee(employeeId,employeeName,employeeBasicSalary,numberOfDayEmployeePresent);

        System.out.println("=========Salary Slip===========");
        System.out.println();
        System.out.println("Employee ID"+":\t"+employee.employeeId);
        System.out.println("Employee Name"+":\t"+employee.employeeName);
        System.out.println("Basic Salary"+":\t"+employee.employeeBasicSalary);
        System.out.println("HRA"+":\t"+employee.calculateHRA());
        System.out.println("DA00"+":\t"+employee.calculateDA());
        System.out.println("Conveyance"+":\t"+Employee.conveyanceAllowance);
        System.out.println("Gross Salary"+":\t"+employee.calculateGrossSalary());
        System.out.println();
        System.out.println("Working Days"+":\t"+Employee.numberOfWorkingDays);
        System.out.println("Present Days: "+"\t"+employee.numberOfDayEmployeePresent);
        System.out.println("Absent Days"+":\t"+employee.absentDays);
        System.out.println("Deduction Salary"+":\t"+employee.calculateDeductionSalary());
        System.out.println();

        System.out.println("Net Salary"+":\t"+employee.calculateNetSalary());
        System.out.println("===================================================");

    }
}
