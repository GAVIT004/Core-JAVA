package Basicsjava.LoopingStatement.WhileLoop;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if (num < 140) {
            while (num <= 140) {
                System.out.print(num + ",");
                num++;
            }
        }else {
            System.out.println("Invalid Input!!!!!!!!!!!!!!!!!!!!!!!!!");

        }
    }
}
