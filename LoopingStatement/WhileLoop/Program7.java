package Basicsjava.LoopingStatement.WhileLoop;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();

        while (num<=170){
            System.out.print(num+",");
            num++;
        }



    }
}
