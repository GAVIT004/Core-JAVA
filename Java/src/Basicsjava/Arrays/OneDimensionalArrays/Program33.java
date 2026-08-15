package Basicsjava.Arrays.OneDimensionalArrays;

import java.util.Scanner;

class NumberIncreasingReversePyramidPattern{

    void numberIncreasePyramidPattern(int number){

        for (int i = number; i >=1; i--) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"\t");
            }
            System.out.println("\t");
        }
        System.out.println();
    }
}

public class Program33 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        NumberIncreasingReversePyramidPattern numberIncreasingReversePyramidPattern=new NumberIncreasingReversePyramidPattern();
        numberIncreasingReversePyramidPattern.numberIncreasePyramidPattern(number);
        scanner.close();
    }
}
