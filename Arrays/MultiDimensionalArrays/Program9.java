package Basicsjava.Arrays.MultiDimensionalArrays;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int [][]arr=new int[3][3];
        System.out.println("Enter a element of array");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Elements of array");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
