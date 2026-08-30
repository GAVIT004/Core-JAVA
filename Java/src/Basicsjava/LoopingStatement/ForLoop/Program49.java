package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class HollowDiamondPyramid{

    void hollowPyramid(int number){

        for (int i=1;i<=number;i++){

            for (int j=i;j<number-1;j++){
                System.out.print(" ");
            }

            for (int k=1;k<=2*i-1;k++){

                if(k==1||k==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i=number;i>=1;i--){

            for (int j=i;j<number-1;j++){
                System.out.print(" ");
            }

            for (int k=1;k<=2*i-1;k++){

                if(k==1||k==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class Program49 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        HollowDiamondPyramid hollowDiamondPyramid=new HollowDiamondPyramid();
        hollowDiamondPyramid.hollowPyramid(number);

        scanner.close();
    }
}
