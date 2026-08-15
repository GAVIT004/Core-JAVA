package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class SquareHallowPattern{

    public void printPattern(int number){

        for (int i = 0; i <number ; i++) {

            for (int j = 0; j <number ; j++) {

                if(i==0||j==0||i==number-1||j==number-1){
                    System.out.print("*"+"\t");
                }else {
                    System.out.print(" "+"\t");
                }
            }
            System.out.println("\t");
        }
    }
}
public class Program30 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        SquareHallowPattern squareHallowPattern=new SquareHallowPattern();
        squareHallowPattern.printPattern(number);
    }
}
