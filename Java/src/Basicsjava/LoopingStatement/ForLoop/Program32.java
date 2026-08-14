package Basicsjava.LoopingStatement.ForLoop;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

class NumberIncreasePyramidPattern{

    void numberIncreasePyramidPattern(int number){

        for (int i = 1; i <=number ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"\t");
            }
            System.out.println("\t");
        }

        System.out.println();
    }
}
public class Program32 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        NumberIncreasePyramidPattern numberIncreasePyramidPattern=new NumberIncreasePyramidPattern();
        numberIncreasePyramidPattern.numberIncreasePyramidPattern(number);

        scanner.close();
    }
}
