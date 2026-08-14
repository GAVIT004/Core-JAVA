package Basicsjava.Methods;

import java.util.Scanner;

class Student{
     String stdName;
     int stdRollNo;
     double stdMarks;

     Student(String name,int roll,double marks){
         stdName=name;
         stdRollNo=roll;
         stdMarks=marks;
     }

     void displaystd(){
         System.out.println("Student Name: "+stdName);
         System.out.println("Student Roll Number: "+stdRollNo);
         System.out.println("Student Marks: "+stdMarks);

     }

     String result(double passingMarks){

        if(stdMarks>=passingMarks){
            System.out.println("PASS");
        }

        return "FAIL!!";
     }

     void updateMarks(double newMarks){
         stdMarks=newMarks;
     }

     double getMarks(){
         return stdMarks;
     }

}

public class methodprog1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("-------Enter A Student Detail-----");
        System.out.println("Enter a student name:");
        String name= sc.next();
        System.out.println("Enter a student roll number: ");
        int roll=sc.nextInt();
        System.out.println("Enter a student marks: ");
        double marks=sc.nextDouble();
        Student std =new Student (name,roll,marks);
        std.displaystd();
        System.out.println("Enter a passing marks:");
        std.result(sc.nextDouble());
        System.out.println ("Enter a new marks: ");
        std.updateMarks(sc.nextDouble());
       System.out.println("Student new marks is: "+ std.getMarks());

    }
}
