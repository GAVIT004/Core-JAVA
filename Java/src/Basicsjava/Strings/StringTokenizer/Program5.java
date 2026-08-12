package Basicsjava.Strings.StringTokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter.....");
        StringTokenizer stringTokenizer=new StringTokenizer(scanner.nextLine());

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

        scanner.close();
    }
}
