package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

public class Program22 {

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

        int secundMinNumber=numbers[1];
        int minNumber=numbers[0];

        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]<minNumber){
                secundMinNumber=minNumber;
                minNumber=numbers[i];
            } else if (numbers[i]<secundMinNumber && numbers[i]!=minNumber) {
                secundMinNumber=numbers[i];
            }
        }

        System.out.println("Secund min number : "+secundMinNumber);

        scanner.close();
    }
}
