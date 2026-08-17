package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class ButterflyStarPattern{

    void butterfly(int number){

        for (int i=1;i<=number;i++){

            for (int j=1;j<=number*2;j++){

                if(j>i&&j<=2*number-i){
                    System.out.print(" "+"\t");
                }else {
                    System.out.print("*"+"\t");
                }
            }
            System.out.println();
        }

        for (int i=number;i>=1;i--){

            for (int j=1;j<=number*2;j++){

                if(j>i&&j<=2*number-i){
                    System.out.print(" "+"\t");
                }else {
                    System.out.print("*"+"\t");
                }
            }
            System.out.println();
        }
    }
}

public class Program39 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of butterfly pattern: ");
        int number=scanner.nextInt();

        ButterflyStarPattern butterflyStarPattern=new ButterflyStarPattern();
        butterflyStarPattern.butterfly(number);

        scanner.close();
    }
}
