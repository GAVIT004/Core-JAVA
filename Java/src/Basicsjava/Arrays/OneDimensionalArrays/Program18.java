package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program18 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a sze of array: ");
        int size=scanner.nextInt();

        int[]numbers=new int[size];
        System.out.println("Enter a elements of array: ");
        for (int i=0;i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
        }

        System.out.println("Our array: ");

        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

        System.out.println();

        for (int i = numbers.length;i>0 ; i--) {
            System.out.print(numbers[i-1]+" ");

        }

        scanner.close();
    }
}
