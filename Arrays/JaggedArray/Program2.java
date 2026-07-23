package Basicsjava.Arrays.JaggedArray;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of student: ");
        int studentNum=scanner.nextInt();
        int [][]studentMarks=new int[studentNum][];
        for(int i=0;i<studentMarks.length;i++){
            System.out.println("Enter number of subject for student"+(i+1)+ ": ");
            int subjectNum=scanner.nextInt();
            studentMarks[i] = new int[subjectNum];
            for (int j=0;j<studentMarks[i].length;j++){
                System.out.println("Enter subject"+(j+1)+" marks");
                studentMarks[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Student marks");
        for (int i=0;i<studentMarks.length;i++){
            System.out.println("Student "+(i+1)+" marks: ");
            for (int j=0;j<studentMarks[i].length;j++){
                System.out.print(studentMarks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
