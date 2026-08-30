package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class HollowTrianglePattern{

    void hollow(int number){

        for(int i=1;i<=number;i++){

            for(int j=i;j<number;j++){
                System.out.print(" ");
            }

            for (int k=1;k<=(2*i-1);k++){

                if (k == 1 || k == (2 * i - 1) || i == number) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class Program47 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        HollowTrianglePattern hollowTrianglePattern=new HollowTrianglePattern();
        hollowTrianglePattern.hollow(number);

        scanner.close();
    }
}
