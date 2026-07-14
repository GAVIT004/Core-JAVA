package Basicsjava.LoopingStatement.WhileLoop;

import java.util.Scanner;

public class Program5 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        System.out.print("Even Numbers: ");
        int i=1;
        while (i<=num){
            if(i%2==0){
                System.out.print(i+",");
            }
            i++;
        }
        System.out.println();
        System.out.print("Odd Numbers: ");
        int j=1;
        while (j<=num){
            if(j%2!=0){
                System.out.print(j+",");
            }
            j++;
        }

    }
}
