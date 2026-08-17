package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class ReverseNumberTrianglePatter{

    void reverseNumberTriangle(int number){

        for (int i=1;i<=number;i++){

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

public class Program46 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number=scanner.nextInt();

        ReverseNumberTrianglePatter reverseNumberTrianglePatter=new ReverseNumberTrianglePatter();
        reverseNumberTrianglePatter.reverseNumberTriangle(number);

        scanner.close();
    }
}
