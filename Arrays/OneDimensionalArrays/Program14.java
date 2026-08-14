package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter a size of array: ");
        int size=scanner.nextInt();
        int []arr=new int[size];
        System.out.println("Enter a elements of array: ");

        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        scanner.close();
    }

}
