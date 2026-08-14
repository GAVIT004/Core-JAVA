package Basicsjava.Arrays.MultiDimensionalArrays;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a rows:");
        int row=scanner.nextInt();
        System.out.print("Enter a columns: ");
        int column=scanner.nextInt();

        int [][] numbers=new int[row][column];

        System.out.println("Enter a elements: ");

        for (int i=0;i<row;i++){

            for (int j=0;j<column;j++){
                numbers[i][j]=scanner.nextInt();
            }
        }

        System.out.print("Enter a element to find index: ");
        int findElement=scanner.nextInt();
        boolean found=false;

        for (int i=0;i<row;i++){

            for (int j=0;j<column;j++){
                if(numbers[i][j]==findElement){
                    System.out.print("Element present in ( "+i+","+j+" ) index");
                    found=true;
                    break;
                }
            }
        }

        if(!found){
            System.out.println("Element is not found");
        }
    }
}
