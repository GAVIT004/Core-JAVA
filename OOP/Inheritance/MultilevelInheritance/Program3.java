package Basicsjava.OOP.Inheritance.MultilevelInheritance;

import java.util.Scanner;

class Collage{
    String collageName="SKNCOE";
    String univercityName="SPPU";

}
class Department extends Collage{
    String depatmentName="Computer";
    int semester=8;

}

class Student extends Department {
    String studentName = "Aditya Gavit";
    int rollNo = 34;
    int[]marks=new int[5];
    Scanner scanner=new Scanner(System.in);
    void acceptMarks(){
        System.out.println("Enter a 5 subject marks");
        for (int i=0;i<marks.length;i++){
            System.out.println("Enter marks subject "+ i);
            marks[i]=scanner.nextInt();
        }
    }
    int total=0;
    void total(){

        for(int i=0;i< marks.length;i++){
            total=total+marks[i];
        }
        System.out.println("Total marks"+total);
    }
    double percentage=0;
    void percentage(){
        percentage=total/5;
        System.out.println("Total marks"+percentage);

    }
    void grade(){
        if(percentage>=90){
            System.out.println("A");
        } else if (percentage>=75) {
            System.out.println("b");
        } else if (percentage>=65) {
            System.out.println("C");
        } else if (percentage>=35) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

    }



}
public class Program3 {
    public static void main(String[] args){
        Student student=new Student();
        System.out.println(student.collageName);
        System.out.println(student.univercityName);
        System.out.println(student.depatmentName);
        System.out.println(student.semester);
        System.out.println(student.studentName);
        System.out.println(student.rollNo);
        System.out.println(student.marks);
        student.acceptMarks();
        student.total();
        student.percentage();
        student.grade();


    }
}
