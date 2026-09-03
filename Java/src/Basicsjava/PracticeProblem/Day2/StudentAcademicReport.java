package Basicsjava.PracticeProblem.Day2;

import java.util.Scanner;

class Student{

    String studentRollNumber;
    String StudentName;
    int javaMarks;
    int databaseMarks;
    int operatingSystemMarks;
    int computerNetworksMarks;
    int mathematicsMarks;

    public Student(String studentRollNumber, String studentName, int javaMarks, int databaseMarks, int operatingSystemMarks, int computerNetworksMarks, int mathematicsMarks) {
        this.studentRollNumber = studentRollNumber;
        StudentName = studentName;
        this.javaMarks = javaMarks;
        this.databaseMarks = databaseMarks;
        this.operatingSystemMarks = operatingSystemMarks;
        this.computerNetworksMarks = computerNetworksMarks;
        this.mathematicsMarks = mathematicsMarks;
    }

    public int totalMarks(){
        return javaMarks+databaseMarks+operatingSystemMarks+computerNetworksMarks+mathematicsMarks;
    }

    public double percentageMarks(){
        return (double) totalMarks() /5;
    }

    public double averageMarks(){
        return (double) totalMarks() /5;
    }
}
public class StudentAcademicReport {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Student Roll Number:");
        String studentRollNumber= scanner.next();
        System.out.println("Enter Student Name:");
        String studentName= scanner.next();
        System.out.println("Enter Java Marks:");
        int javaMarks= scanner.nextInt();
        System.out.println("Enter Database Marks:");
        int databaseMarks= scanner.nextInt();
        System.out.println("Enter Operating System Marks:");
        int operatingSystemMarks= scanner.nextInt();
        System.out.println("Enter Computer Networks Marks:");
        int computerNetworksMarks=scanner.nextInt();
        System.out.println("Enter Mathematics Marks:");
        int mathematicsMarks= scanner.nextInt();

        Student student=new Student(studentRollNumber,studentName,javaMarks,databaseMarks,operatingSystemMarks,computerNetworksMarks,mathematicsMarks);

        System.out.println("============Student Report ==============");
        System.out.println("Roll Number: "+student.studentRollNumber);
        System.out.println("Name: "+student.StudentName);
        System.out.println();
        System.out.println("Java Marks: "+student.javaMarks);
        System.out.println("Database Marks: "+student.databaseMarks);
        System.out.println("OS Marks: "+student.operatingSystemMarks);
        System.out.println("CN Marks: "+student.computerNetworksMarks);
        System.out.println("Maths Marks: "+student.mathematicsMarks);
        System.out.println();
        System.out.println("Total: "+student.totalMarks()+"/500");
        System.out.println("Percentage: "+student.percentageMarks()+"%");
        System.out.println("Average: "+student.averageMarks());
        System.out.println("=====================================");
    }
}
