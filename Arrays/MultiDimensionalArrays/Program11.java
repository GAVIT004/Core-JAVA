package Basicsjava.Arrays.MultiDimensionalArrays;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a rows: ");
        int rows=scanner.nextInt();
        System.out.print("Enter a columns: ");
        int columns=scanner.nextInt();

        int [][]numbers=new int[rows][columns];

        int largestNum= numbers[0][0];

        System.out.println("Enter elements of array: ");

        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                numbers[i][j]=scanner.nextInt();
            }
        }

        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){

                if(numbers[i][i]>largestNum){
                   largestNum=numbers[i][j];
                }
            }
        }
        System.out.println("Largest number: "+largestNum);
        scanner.close();
    }
}
