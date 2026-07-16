package Basicsjava.LoopingStatement.Do_WhileLoop;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        int i=1;
        do{
            int table=num*i;
            System.out.println(num+" X "+i+" = "+table);
            i++;
        }while (i<=10);
        scanner.close();
    }
}
