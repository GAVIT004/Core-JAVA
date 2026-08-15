package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class RhombusPattern{
    
    void Rhombus(int number){

        for (int i = 0; i <=number; i++) {

            for (int j = 0; j <=number-i ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <=number; j++) {
                System.out.print("*"+" ");
            }

            System.out.println();
        }

    }
}

public class Program37 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        RhombusPattern rhombusPattern=new RhombusPattern();
        rhombusPattern.Rhombus(number);
    }
}
