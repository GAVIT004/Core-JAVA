package Basicsjava.Arrays.MultiDimensionalArrays;

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a row: ");
        int row=scanner.nextInt();
        System.out.println("Enter a column: ");
        int column=scanner.nextInt();
        int [][]matrix=new int[row][column];
        int [][]matrix1=new int[row][column];
        System.out.println("Enter matrix1 elements: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }

        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Enter matrix2 elements: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                matrix1[i][j]=scanner.nextInt();
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println();
        }
        int[][] multiplication=new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                multiplication[j][i]=matrix[j][i]*matrix1[j][i];
            }
        }
        System.out.println("Sum of matrix1 and matrix2: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(multiplication[i][j]+"\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
