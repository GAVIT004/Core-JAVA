package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program17 {

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

        int evenNumbers=0;
        int oddNumbers=0;

        for (int i=0;i<numbers.length;i++){

            if (numbers[i]%2==0){
                evenNumbers++;
            }else {
                oddNumbers++;
            }
        }
        System.out.println();

        System.out.println("Even number: "+evenNumbers);
        System.out.println("Odd numbers: "+oddNumbers);

        scanner.close();

    }

}
