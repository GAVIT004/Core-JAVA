package Basicsjava.Strings.StringBuffer;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a something...");
        StringBuffer something=new StringBuffer(scanner.nextLine());
        System.out.println(something.reverse());
    }
}
