package Basicsjava.LoopingStatement.Do_WhileLoop;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        int count=0;
        do {
            count++;
            num=num/10;


        }while (num!=0);
        System.out.println("Total digit: "+count);
        scanner.close();
    }
}
