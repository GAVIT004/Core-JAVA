package Basicsjava.PracticeProblem;

import java.util.Scanner;

class Student{
    void calculateResult(int marks){
        if(marks>=90){
            System.out.println(marks+" Grade A");
        } else if (marks>=75) {
            System.out.println(marks+" Grade B");
        } else if (marks>=60) {
            System.out.println(marks+" Grade C");
        } else if (marks>=35) {
            System.out.println(marks+" Grade Pass");
        }else {
            System.out.println(marks+" FAIL!!!");
        }
    }
}
public class Program2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a student marks: ");
        int marks=scanner.nextInt();
        Student student=new Student();
        student.calculateResult(marks);

        scanner.close();


    }
}
