package Basicsjava.Arrays.MultiDimensionalArrays;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a rows: ");
        int rows=scanner.nextInt();
        System.out.println("Enter a columns: ");
        int columns=scanner.nextInt();
        int numbers[][]=new int[rows][columns];
        System.out.println("Enter a elements: ");
        for (int i=0;i<numbers.length;i++){
           for (int j=0;j<numbers[i].length;j++){
               numbers[i][j]=scanner.nextInt();
           }
        }

        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i=0;i<numbers.length;i++){
            int sum=0;
            for (int j=0;j<numbers[i].length;j++){
                sum=sum+numbers[i][j];
            }
            System.out.println("Sum of row "+(i+1)+":"+sum);
        }

        scanner.close();
    }
}
