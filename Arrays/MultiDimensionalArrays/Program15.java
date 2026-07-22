package Basicsjava.Arrays.MultiDimensionalArrays;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a rows: ");
        int rows=scanner.nextInt();
        System.out.println("Enter a columns: ");
        int columns=scanner.nextInt();
        System.out.println("Enter a height:");
        int height=scanner.nextInt();

        int [][][] numbers=new int[rows][columns][height];

        System.out.println("Enter a elements: ");

        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                for (int k=0;k<numbers[j].length;k++){
                    numbers[i][j][k]=scanner.nextInt();
                }
            }
        }

        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                for (int k=0;k<numbers[j].length;k++){
                    System.out.print( numbers[i][j][k]+"\t");
                }
                System.out.println("\t");
            }
            System.out.println("\t");
        }

        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                for (int k=0;k<numbers[j].length;k++){
                    if(numbers[i][j][k]%2==0){
                        System.out.println("Even number: "+numbers[i][j][k]);
                    }else {
                        System.out.println("Odd numbers: "+numbers[i][j][k]);
                    }
                }
            }
        }
    }
}
