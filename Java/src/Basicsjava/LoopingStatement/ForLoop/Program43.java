package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class LeftHalfPyramidPattern{

    void left(int number){

        for (int i=number;i>=1;i--){

            for (int j=1;j<=i;j++){
                System.out.print(" "+"\t");
            }

            for (int k=0;k<=number-i;k++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}

public class Program43 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        LeftHalfPyramidPattern leftHalfPyramidPattern=new LeftHalfPyramidPattern();
        leftHalfPyramidPattern.left(number);

        scanner.close();
    }
}
