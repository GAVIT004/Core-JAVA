package Basicsjava.Arrays.JaggedArray;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a size of row 1: ");
        int size=scanner.nextInt();

        int [][]numbers=new int[size][];

        for (int i=0;i<numbers.length;i++){
            System.out.println("Enter a size of row "+(i+2)+" :");
            int row=scanner.nextInt();

            numbers[i]=new int[row];
            System.out.println("Enter elements of row "+(i+1)+" :");
            for (int j=0;j<numbers[i].length;j++){
                numbers[i][j]=scanner.nextInt();
            }
        }

        for (int i=0;i<numbers.length;i++){

            for (int j=0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i=0;i<numbers.length;i++){
            int sum=0;
            for (int j=0;j<numbers[i].length;j++){
                sum=sum+numbers[i][j];

            }
            System.out.println("Sum of row "+(i+1)+" :"+sum);
        }
    }
}
