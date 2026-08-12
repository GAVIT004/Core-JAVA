package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int arraySize = scanner.nextInt();

        int[] numbersArray = new int[arraySize];
        System.out.println("Enter a elements of array");

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = scanner.nextInt();
        }

        System.out.println("Our Array: ");

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < numbersArray.length; i++) {

            for (int j = i + 1; j < numbersArray.length; j++) {

                if (numbersArray[i] > numbersArray[j]) {

                    numbersArray[i] = numbersArray[i] + numbersArray[j];
                    numbersArray[j] = numbersArray[i] - numbersArray[j];
                    numbersArray[i] = numbersArray[i] - numbersArray[j];
                }

            }

            System.out.print(numbersArray[i]+" ");
        }

        scanner.close();
    }
}
