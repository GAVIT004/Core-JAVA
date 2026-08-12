package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program24 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a sze of array: ");
        int size=scanner.nextInt();

        int[]numbersArray=new int[size];
        System.out.println("Enter a elements of array: ");
        for (int i=0;i< numbersArray.length;i++){
            numbersArray[i]=scanner.nextInt();
        }

        System.out.println("Our Array: ");

        for (int i=0;i<numbersArray.length;i++){
            System.out.print(numbersArray[i]+" ");
        }
        System.out.println();

        boolean isArraySorted=true;
        for (int i = 0; i <numbersArray.length ; i++) {
            if(numbersArray[i]>numbersArray[i+1]){
                isArraySorted=false;
                break;
            }
        }

        if (isArraySorted){
            System.out.println("Array is sorted");
        } else if (!isArraySorted) {
            System.out.println("Array is not sorted");
        }

        scanner.close();
    }
}
