package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class ReverseRightHalfPyramidPattern{

    void reverse(int number){

        for (int i=number;i>=1;i--){

            for (int j=1;j<=i;j++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}

public class Program42 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number");
        int number=scanner.nextInt();

        ReverseRightHalfPyramidPattern reverseRightHalfPyramidPattern=new ReverseRightHalfPyramidPattern();
        reverseRightHalfPyramidPattern.reverse(number);

        scanner.close();
    }
}
