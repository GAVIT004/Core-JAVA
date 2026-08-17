package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class TriangleStarPattern{

    void triangle(int number){

        for (int i=1;i<=number;i++){

            for (int j=1;j<=number-i;j++){
                System.out.print(" ");
            }

            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Program45 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        TriangleStarPattern triangleStarPattern=new TriangleStarPattern();
        triangleStarPattern.triangle(number);

        scanner.close();
    }
}
