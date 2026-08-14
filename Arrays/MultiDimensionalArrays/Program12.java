package Basicsjava.Arrays.MultiDimensionalArrays;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a rows: ");
        int rows= scanner.nextInt();
        System.out.println("Enter a columns: ");
        int columns=scanner.nextInt();
        int [][]numbers=new int[rows][columns];
        System.out.println("Enter a elements: ");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                numbers[i][j]=scanner.nextInt();
            }
        }

        int smallestNum=numbers[0][0];

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
               if (numbers[i][j]<smallestNum){
                   smallestNum=numbers[i][j];
               }
            }
        }

        System.out.println("Smallest Number: "+smallestNum);
        scanner.close();
    }
}
