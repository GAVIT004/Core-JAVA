package Basicsjava.Arrays.OneDimensionalArrays;


/*    Find duplicate elements

    Input: 10 20 30 20 40 10
    Output:
            10
            20*/

import java.util.Scanner;

public class Program26 {

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

        int []frequentElement=new int[numbersArray.length];
        int index=0;
        for (int i = 0; i <numbersArray.length ; i++) {
            boolean duplicateElement=false;
            for (int j=0;j<i;j++){
                if (numbersArray[i]==numbersArray[j]) {
                    frequentElement[i]=numbersArray[i];
                    duplicateElement=true;
                    break;
                }
            }

            if(duplicateElement){

                boolean isAlreadyStored=false;

                for (int j = 0; j < index; j++) {

                    if (frequentElement[j]<numbersArray[i]){
                        isAlreadyStored=false;
                        break;
                    }
                }

                if(!isAlreadyStored){
                    frequentElement[index]=numbersArray[i];
                    index++;
                }
            }
        }

        for (int i = 0; i <index ; i++) {
            System.out.println(frequentElement[i]+" ");
        }

        scanner.close();
    }
}
