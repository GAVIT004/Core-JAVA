package Basicsjava;

import java.util.Scanner;

class StudentDetail{
    String stdName;
    int stdRoll;
    double stdMarks;

    StudentDetail(String name,int roll,double marks){
        stdName=name;
        stdRoll=roll;
        stdMarks=marks;
    }

    void display(){
        System.out.println("Student Name: "+stdName);
        System.out.println("Student Roll Number: "+stdRoll);
        System.out.println("Student Marks: "+stdMarks);
    }

    void cheakresult(){
        if(stdMarks<35){
            System.out.println("Failed");
        }else {
            System.out.println("Passed");
        }
    }

}

public class Practiceprog2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Who many students???");
        int noStd= sc.nextInt();

        StudentDetail[] students= new StudentDetail[noStd];
        for(int i=0;i<noStd;i++) {
            System.out.println("Enter Student detail "+(i+1));
            System.out.println("Enter a Student Name: ");
            String name = sc.next();
            System.out.println("Enter a Student Roll Number: ");
            int roll = sc.nextInt();
            System.out.println("Enter a Student Marks: ");
            double marks = sc.nextDouble();
            students[i]=new StudentDetail(name,roll,marks);

        }

        System.out.println("Student Detail:");
        for( int i=0;i<noStd;i++){
            students[i].display();
            students[i].cheakresult();

        }

        sc.close();

    }
}
