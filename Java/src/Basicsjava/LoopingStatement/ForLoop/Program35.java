package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class ZeroOneTrianglePattern{

    void ZeroOneTriangle(int number){

        for (int i = 1; i <=number ; i++) {

            for (int j = 1; j <=i; j++) {

                if((i+j)%2==0){
                    System.out.print(1+"\t");
                }else {
                    System.out.print(0+"\t");
                }
            }
            System.out.println("\t");
        }
    }

}


public class Program35 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        ZeroOneTrianglePattern zeroOneTrianglePattern=new ZeroOneTrianglePattern();
        zeroOneTrianglePattern.ZeroOneTriangle(number);

        scanner.close();
    }
}
