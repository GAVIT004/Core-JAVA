package Basicsjava.PracticeProblem;

import java.util.Scanner;

class Student1{
    String studentName;
    int [] attendance;
    int totalDays;
    int count=0;
    double totalPresent;

    void getStudent(String name,int days){
        studentName=name;
        totalDays=days;
        attendance=new int[days];
    }

    void addAttendance(Scanner scanner){
        for (int i=0;i<attendance.length;i++) {
            System.out.println("Mark a attendance(0=absent/present=1) Day "+(i+1));
            attendance[i]=scanner.nextInt();
            if(attendance[i]==1){
                count++;
            }
        }
    }

     double calculateAttendance(){
        totalPresent=count*100/totalDays;
        return totalPresent;
    }

    void displayResult(){
        System.out.println("Student name: "+studentName);
        System.out.println("Student total present days: "+count);
        System.out.println("Student total attendance "+totalPresent+"%");
        if(totalPresent>=75){
            System.out.println("Student is eligible");
        }else {
            System.out.println("Student not eligible");
        }
    }
}
public class Program8 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a student name: ");
        String name=scanner.nextLine();

        System.out.println("Enter a total work days");
        int day=scanner.nextInt();

        Student1 student1=new Student1();
        student1.getStudent(name,day);
        student1.addAttendance(scanner);
        student1.calculateAttendance();
        student1.displayResult();

        scanner.close();
    }
}
