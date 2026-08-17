package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class DiamondStarPattern{

    void diamond(int number){



        for (int i = 1; i <=number ; i++) {

            for (int j = 1; j <=number-i ; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }

        for (int i =number-1; i >=1 ; i--) {

            for (int j = 1; j <=number-i ; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}

public class Program38 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of diamond star pattern");
        int number=scanner.nextInt();

        DiamondStarPattern diamondStarPattern=new DiamondStarPattern();
        diamondStarPattern.diamond(number);

        scanner.close();
    }
}
