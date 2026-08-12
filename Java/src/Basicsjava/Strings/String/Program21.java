package Basicsjava.Strings.String;

import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a something...");
        String something=scanner.nextLine();
        System.out.println("Original String: "+something);

        System.out.println("Reversed String: ");
        for (int i=something.length()-1;i>=0;i--){
            System.out.print(something.charAt(i));
        }
        scanner.close();
    }
}
