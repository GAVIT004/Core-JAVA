package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class ReverseHollowTrianglePattern{

    void reverseHollow(int number){

        for (int i=number;i>=1;i--){

            for (int j=i;j<number;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=(2*i-1);k++){

                if(k==1||k==(2*i-1)||i==number){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class Program48 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        ReverseHollowTrianglePattern reverseHollowTrianglePattern=new ReverseHollowTrianglePattern();
        reverseHollowTrianglePattern.reverseHollow(number);

        scanner.close();
    }
}
