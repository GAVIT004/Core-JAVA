package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program23 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a sze of array: ");
        int size=scanner.nextInt();

        int[]numbers=new int[size];
        System.out.println("Enter a elements of array: ");
        for (int i=0;i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
        }

        System.out.println("Array1: ");

        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        int[]numbers1=new int[size];

        for (int i = 0; i < numbers1.length ; i++) {
            numbers1[i]=numbers[i];
        }

        System.out.println("Array2: ");

        for (int i = 0; i < numbers1.length ; i++) {
            System.out.print(numbers1[i]+" ");
        }
    }
}
