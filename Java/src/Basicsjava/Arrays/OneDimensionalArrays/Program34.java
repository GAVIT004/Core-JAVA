package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

class NumberChangingPyramidPattern{

    void numberChangingPattern(int number){

        int num=1;

        for (int i = 1; i <=number ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(num+"\t");
                num++;
            }
            System.out.println("\t");
        }
        System.out.println();
    }
}

public class Program34 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        NumberChangingPyramidPattern numberChangingPyramidPattern=new NumberChangingPyramidPattern();
        numberChangingPyramidPattern.numberChangingPattern(number);
        scanner.close();
    }
}
