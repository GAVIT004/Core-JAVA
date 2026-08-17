package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class MirrorImageTrianglePattern{

    void mirror(int number){

        for (int i=1;i<=number;i++){

            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }

            for (int k=i;k<=number;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

        for (int i=number-1;i>=1;i--){

            for (int j=1;j<i;j++){
                System.out.print(" ");
            }

            for (int k=i;k<=number;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}

public class Program50 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number=scanner.nextInt();

        MirrorImageTrianglePattern mirrorImageTrianglePattern=new MirrorImageTrianglePattern();
        mirrorImageTrianglePattern.mirror(number);

        scanner.close();
    }
}
