package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program11 {



    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a size of array: ");
        int arraySize=scanner.nextInt();

        int []numbers=new int[arraySize];
        System.out.println("Enter a array elements: ");

        for (int i=0;i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
        }

        System.out.println("Our array: ");
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

        System.out.println();

        int minNumber=numbers[0];

        for (int i=0;i<numbers.length;i++){

            if(numbers[i]<minNumber){
                minNumber=numbers[i];
            }
        }

        System.out.println("Min Number: "+minNumber);

        scanner.close();
    }


}


