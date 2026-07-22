package Basicsjava.Arrays.MultiDimensionalArrays;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int [][]numbers=new int[4][4];
        int sum=0;
        System.out.println("Enter elements of array");
        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                numbers[i][j]= scanner.nextInt();
            }
        }

        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                sum=sum+numbers[i][j];
            }
        }

        System.out.print("Sum of array: "+sum);
    }
}
