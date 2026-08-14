package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program25 {

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


//        int []duplicateElement=new int[numbersArray.length];

        int[]duplicateElement= Arrays.stream(numbersArray).distinct().toArray();

       /* Arrays.stream() converts the array into a stream,
        distinct() removes duplicate elements,
                and toArray() converts the result back into an array.*/

        /*int index=0;

        for (int i = 0; i <numbersArray.length ; i++) {
            boolean duplicate=false;

            for (int j =0; j < i ; j++) {

                if (numbersArray[i]==numbersArray[j]){
                    duplicate=true;
                    break;
                }
            }

            if(!duplicate){
                duplicateElement[index]=numbersArray[i];
                index++;
            }
        }*/

       /* System.out.println("Array after remove duplicate element");
        for (int i = 0; i < index; i++) {
            System.out.println(duplicateElement[i]+" ");
        }
        System.out.println();

        scanner.close();*/


        System.out.println("Array after remove duplicate element");
        for (int i = 0; i < duplicateElement.length; i++) {
            System.out.println(duplicateElement[i]+" ");
        }
        System.out.println();

        scanner.close();
    }
}
