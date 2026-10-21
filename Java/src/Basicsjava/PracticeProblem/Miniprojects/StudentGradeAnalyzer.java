package Basicsjava.PracticeProblem.Miniprojects;

import java.util.Scanner;

public class StudentGradeAnalyzer {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int subject1Marks;
        int subject2Marks;
        int subject3Marks ;
        int subject4Marks;
        int subject5Marks;

        System.out.println("Enter subject1 marks (0-100)");
        subject1Marks= scanner.nextInt();

        while (subject1Marks<0||subject1Marks>100){
            System.out.println("Invalid marks! Enter subject1 marks aging (0-100)");
            subject1Marks= scanner.nextInt();
        }

        System.out.println("Enter subject2 marks (0-100");
        subject2Marks= scanner.nextInt();

        while (subject2Marks<0||subject2Marks>100){
            System.out.println("Invalid marks! Enter subject2 marks again (0-100)");
            subject2Marks= scanner.nextInt();
        }

        System.out.println("Enter subject3 marks (0-100)");
        subject3Marks= scanner.nextInt();

        while (subject3Marks<0||subject3Marks>100){
            System.out.println("Invalid marks! Enter subject3 marks again (0-100)");
            subject3Marks= scanner.nextInt();
        }

        System.out.println("Enter subject4 marks (0-100)");
        subject4Marks= scanner.nextInt();

        while (subject4Marks<0||subject4Marks>100){
            System.out.println("Invalid marks! Enter subject4 marks again (0-100)");
            subject4Marks= scanner.nextInt();
        }

        System.out.println("Enter subject5 marks (0-100)");
        subject5Marks= scanner.nextInt();

        while (subject5Marks<0||subject5Marks>100){
            System.out.println("Invalid marks! Enter subject5 marks again (0-100)");
            subject5Marks= scanner.nextInt();
        }

        int totalMarks=subject1Marks+subject2Marks+subject3Marks+subject4Marks+subject5Marks;

        double percentage=(totalMarks/500.00)*100;

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Subject 1: " + subject1Marks);
        System.out.println("Subject 2: " + subject2Marks);
        System.out.println("Subject 3: " + subject3Marks);
        System.out.println("Subject 4: " + subject4Marks);
        System.out.println("Subject 5: " + subject5Marks);

        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.printf("Percentage: %.2f%%\n", percentage);

        boolean passed=subject1Marks>=35 && subject2Marks>=35 &&subject3Marks>=35 && subject4Marks>=35 && subject5Marks>=35;

        if(!passed){
            System.out.println("Result : FAIL");
            System.out.println("Grade : F");
        }else {
            System.out.println("Result : PASS");
        }

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E");
        }

        scanner.close();
    }
}
