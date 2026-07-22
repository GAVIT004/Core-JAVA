package Basicsjava.Arrays.MultiDimensionalArrays;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a rows: ");
        int rows=scanner.nextInt();
        System.out.println("Enter a columns: ");
        int columns=scanner.nextInt();
        int numbers[][]=new int[rows][columns];
        System.out.println("Enter a elements: ");

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                numbers[i][j]=scanner.nextInt();
            }
        }

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(numbers[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i=0;i<rows;i++){
            int sum=0;
            for (int j=0;j<columns;j++){
                sum=sum+numbers[j][i];
            }
            System.out.println("Sum of column "+(i+1)+":"+sum);
        }

        scanner.close();
    }
}
