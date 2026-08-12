package Basicsjava.PracticeProblem.Day1;

import java.util.Scanner;

public class StudentResult {
    static int javaMarks;
    static int cProgrammingMarks;
    static  int databaseMarks;
    static  int mathMarks;
    static int englishMarks;
    static  int totalMarks;
    static  double percentage;
    static  double averageMarks;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a collage name: ");
        final String collageName=scanner.nextLine();

        System.out.println("#===ENTER A STUDENT DETAIL===#");
        System.out.println("Enter a student id: ");
        scanner.nextLine();
        int studentId=scanner.nextInt();
        System.out.println("Enter a student name: ");
        String studentName=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter a student age: ");
        int studentAge=scanner.nextInt();
        System.out.println("Enter a student gender: ");
        char studentGender=scanner.next().charAt(0);
        System.out.println("Enter a student course: ");
        String studentCourse=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter a student division: ");
        int studentDivision=scanner.nextInt();

        System.out.println("#===ENTER A STUDENT MARKS===#");
        System.out.println("Enter a Java marks: ");
        javaMarks=scanner.nextInt();
        System.out.println("Enter a C programming marks: ");
        cProgrammingMarks=scanner.nextInt();
        System.out.println("Enter a Database marks: ");
        databaseMarks=scanner.nextInt();
        System.out.println("Enter a Maths marks: ");
        mathMarks=scanner.nextInt();
        System.out.println("Enter a English marks: ");
        englishMarks=scanner.nextInt();

        totalMarks=javaMarks+cProgrammingMarks+databaseMarks+mathMarks+englishMarks;
        percentage= (double) totalMarks /5*100;
        averageMarks= (double) totalMarks /5;

        System.out.println("#===STUDENT INFO===#");
        System.out.println("Collage Name: "+collageName);
        System.out.println("Student id: "+studentId);
        System.out.println("Student name: "+studentName);
        System.out.println("Student age: "+studentAge);
        System.out.println("Student gender: "+studentGender);
        System.out.println("Student course: "+studentCourse);
        System.out.println("Student division: "+studentDivision);

        System.out.println("#===STUDENT RESULT===#");
        System.out.println("Java marks: "+javaMarks);
        System.out.println("C programming marks: "+cProgrammingMarks);
        System.out.println("Database marks: "+databaseMarks);
        System.out.println("Math marks: "+mathMarks);
        System.out.println("English marks: "+englishMarks);
        System.out.println("Total marks: "+totalMarks);
        System.out.println("Percentage: "+percentage);
        System.out.println("Average marks: "+averageMarks);

        System.out.println("Enter a java marks: ");
        javaMarks=scanner.nextInt();

        System.out.println("#===STUDENT UPDATED RESULT===#");

        totalMarks=javaMarks+cProgrammingMarks+databaseMarks+mathMarks+englishMarks;
        percentage= (double) totalMarks /5*100;
        averageMarks= (double) totalMarks /5;

        System.out.println("Updated java marks: "+javaMarks);
        System.out.println("Total marks: "+totalMarks);
        System.out.println("Percentage: "+percentage);
        System.out.println("Average marks: "+averageMarks);

        scanner.close();
    }
}
