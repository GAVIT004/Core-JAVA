package Basicsjava.PracticeProblem.Day1;

import java.util.Scanner;

public class StudentProfile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final String collageName="smt.Kashibai Navale collage of engnering";

        System.out.println("Enter a semester number: ");
        byte semesterNumber=scanner.nextByte();
        System.out.println("Enter roll number: ");
        short rollNumber=scanner.nextShort();
        System.out.println("Enter a student ID: ");
        int studentId=scanner.nextInt();
        System.out.println("Enter a mobile number: ");
        long mobileNumber=scanner.nextLong();
        System.out.println("Enter a attendance percentage: ");
        float attendance=scanner.nextFloat();
        System.out.println("Enter a CGPA: ");
        double CGPA=scanner.nextDouble();
        System.out.println("Enter a gender: ");
        char gender=scanner.next().charAt(0);
        System.out.println("You are scholarship holder? ");
        boolean isScholarship=scanner.nextBoolean();

        System.out.println("Enter a student name: ");
        String studentName=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter a course name: ");
        String course=scanner.next();
        scanner.nextLine();
        System.out.println("Enter a address: ");
        String address=scanner.nextLine();

        System.out.println("Collage Name: "+collageName);
        System.out.println("Student ID: "+studentId);
        System.out.println("Student Name: "+studentName);
        System.out.println("Semester: "+semesterNumber);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Mobile Number: "+mobileNumber);
        System.out.println("Attendance: "+attendance);
        System.out.println("CGPA: "+CGPA);
        System.out.println("Gender: "+gender);
        System.out.println("Scholarship holder: "+isScholarship);
        System.out.println("Course: "+course);
        System.out.println("Address: "+address);

        System.out.println("Enter a updated attendance: ");
        attendance=scanner.nextFloat();
        System.out.println("Enter a updated CGPA: ");
        CGPA=scanner.nextDouble();
        System.out.println("Updated Attendance: "+attendance);
        System.out.println("Updated CGPA: "+CGPA);

    }
}
