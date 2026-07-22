package Basicsjava.Arrays.MultiDimensionalArrays;

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row: ");
        int row = scanner.nextInt();
        System.out.println("Enter a column: ");
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Orignal");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\t");
        }
        System.out.println("Tranpose");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println("\t");
        }
    }
}