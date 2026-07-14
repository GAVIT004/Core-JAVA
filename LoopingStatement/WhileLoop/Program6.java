package Basicsjava.LoopingStatement.WhileLoop;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        int i=num;
        while (i>=1){
            System.out.print(i+",");
            i--;
        }
    }
}
