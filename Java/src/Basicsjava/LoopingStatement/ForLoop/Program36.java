package Basicsjava.LoopingStatement.ForLoop;

import java.util.Scanner;

class PalindromeTrianglePattern{
    
    void PalindromeTriangle(long number){

        for (int i = 1; i <=number; i++) {

            for (int j = 1; j <=2*(number-i) ; j++) {
                System.out.print(" ");
            }

            for(int k=i;k>=1;k--){
                System.out.print(k+" ");
            }

            for (int l=2;l<=i;l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }

    }
}

public class Program36 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        long number=scanner.nextInt();

        PalindromeTrianglePattern palindromeTrianglePattern=new PalindromeTrianglePattern();
        palindromeTrianglePattern.PalindromeTriangle(number);

        scanner.close();
    }
}
