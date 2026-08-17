package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class SquareFillPattern{

    void Square(int number){

        for (int i=1;i<=number;i++){

            for (int j=1;j<=number;j++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}

public class Program40 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter  a number: ");
        int number=scanner.nextInt();

        SquareFillPattern squareFillPattern=new SquareFillPattern();
        squareFillPattern.Square(number);

        scanner.close();
    }
}
