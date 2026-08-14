package Basicsjava.Arrays.OneDimensionalArrays;


/*Find frequency of every element
Input: 10 20 10 30 20 10


Output:
        10 -> 3
        20 -> 2
        30 -> 1*/

import java.util.Scanner;

public class Program27 {

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


        for (int i = 0; i <numbersArray.length ; i++) {
            boolean isDuplicate=false;
            for (int j = 0; j <i; j++) {

                if (numbersArray[i]==numbersArray[j]){
                    isDuplicate=true;
                    break;
                }
            }

            if(isDuplicate){
               continue;
            }

            int count=0;

            for (int j = 0; j <numbersArray.length ; j++) {

                if(numbersArray[i]==numbersArray[j]){
                    count++;
                }
            }

            System.out.println(numbersArray[i] + " -> " + count);
        }

       scanner.close();
    }
}
