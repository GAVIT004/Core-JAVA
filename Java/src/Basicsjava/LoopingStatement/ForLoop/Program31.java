package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class NumberTrianglePattern{

    void printTrianglePattern(int number){

        for (int i = 1; i <= number ; i++) {

            for (int j = 1; j <= number-i; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}
public class Program31 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();
        
        NumberTrianglePattern numberTrianglePattern=new NumberTrianglePattern();
        numberTrianglePattern.printTrianglePattern(number);
    }
}
