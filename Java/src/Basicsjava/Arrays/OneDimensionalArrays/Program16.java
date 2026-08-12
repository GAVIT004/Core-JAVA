package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter a size of array: ");
        int size=scanner.nextInt();
        int []arr=new int[size];
        System.out.println("Enter a elements of array: ");

        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }

        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        System.out.println("Sum of all elements: "+sum);

        double averageOfArray= (double) sum /size;
        System.out.println("Average of array: "+averageOfArray);

        scanner.close();
    }
}
