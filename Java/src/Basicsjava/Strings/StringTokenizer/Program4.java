package Basicsjava.Strings.StringTokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter.....");
        StringTokenizer stringTokenizer=new StringTokenizer(scanner.nextLine());
        int count=stringTokenizer.countTokens();
        System.out.println("Total words = "+count);
        scanner.close();
    }
}
