package Basicsjava.PracticeProblem.Day1;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a student name: ");
        String studentName=scanner.nextLine();

        System.out.println("Enter a student marks: ");
        int marks=scanner.nextInt();

        if(marks<=100){
            System.out.println("Student Name: "+studentName);
            System.out.println("Student marks: "+marks);
        }else {
            System.out.println("Invalid marks!!!");
        }

        int choice;

        do{
            System.out.println("1.Student Grade");
            System.out.println("2.Course Selection");
            System.out.println("3.Attendance Report");
            System.out.println("4.Subject List");
            System.out.println("5.Exit");

            System.out.println("Enter a choice: ");
            choice=scanner.nextInt();
        }while (choice!=6);
    }
}
