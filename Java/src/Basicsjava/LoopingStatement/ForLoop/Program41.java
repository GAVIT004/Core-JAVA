package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class RightHalfPyramidPattern{

    void right(int number){

        for (int i=1;i<=number;i++){

            for (int j=1;j<=i;j++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}

public class Program41 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        RightHalfPyramidPattern rightHalfPyramidPattern=new RightHalfPyramidPattern();
        rightHalfPyramidPattern.right(number);

        scanner.close();
    }
}
