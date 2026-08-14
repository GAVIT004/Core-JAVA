package Basicsjava.LoopingStatement.Do_WhileLoop;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        int sum=0;
        int i=1;
        do{
            sum=sum+i;
            i++;

        }while (i<=num);

        System.out.println("Sum of number: "+sum);

        scanner.close();
    }
}
