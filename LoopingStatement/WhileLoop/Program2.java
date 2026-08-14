package Basicsjava.LoopingStatement.WhileLoop;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        int i=1;
        while (i<=num){
            System.out.print(i+",");
            i++;
        }
    }

}
