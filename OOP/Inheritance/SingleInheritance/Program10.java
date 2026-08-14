package Basicsjava.OOP.Inheritance.SingleInheritance;
import java.util.Scanner;
class Employees {

    int empId;
    String empName;
    double basicSalary;

    Scanner scanner = new Scanner(System.in);

    void acceptData() {

        System.out.print("Enter Employee ID : ");
        empId = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Employee Name : ");
        empName = scanner.nextLine();

        System.out.print("Enter Basic Salary : ");
        basicSalary = scanner.nextDouble();
    }

    void displayEmployee() {

        System.out.println("\n------ Employee Details ------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary : " + basicSalary);
    }
}

class Developers extends Employee {
    Scanner scanner=new Scanner(System.in);
    String projectName;
    double bonus;

    void acceptDeveloperData() {

        scanner.nextLine();

        System.out.print("Enter Project Name : ");
        projectName = scanner.nextLine();

        System.out.print("Enter Bonus : ");
        bonus = scanner.nextDouble();
    }

    void calculateSalary(double basicSalary) {

        double totalSalary = basicSalary + bonus;

        System.out.println("\n------ Developer Details ------");
        System.out.println("Project Name : " + projectName);
        System.out.println("Bonus : " + bonus);
        System.out.println("Total Salary : " + totalSalary);
    }
}

public class Program10 {
    public static void main(String[] args){
        Developers developers=new Developers();
        developers.acceptDeveloperData();
    }
}