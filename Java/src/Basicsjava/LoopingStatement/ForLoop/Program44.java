package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class ReverseLeftHalfPyramidPattern{

    void reverseLeft(int number){

        for (int i=number;i>=1;i--){

            for (int j=0;j<number-i;j++){
                System.out.print(" "+"\t");
            }

            for (int k=0;k<i;k++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}

public class Program44 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        ReverseLeftHalfPyramidPattern reverseLeftHalfPyramidPattern=new ReverseLeftHalfPyramidPattern();
        reverseLeftHalfPyramidPattern.reverseLeft(number);

        scanner.close();
    }
}
