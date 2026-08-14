package Basicsjava.Strings.String;

import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a something...");
        String something=scanner.nextLine().trim();
        System.out.println(something);
        System.out.println(something.replace(" ",""));
        scanner.close();
    }
}
