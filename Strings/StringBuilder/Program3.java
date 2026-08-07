package Basicsjava.Strings.StringBuilder;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter...");
        StringBuilder stringBuilder=new StringBuilder(scanner.nextLine().trim());
        System.out.println(stringBuilder);
        for (int i=0;i<stringBuilder.length();i++){
            char chars=stringBuilder.charAt(i);
            if (Character.isDigit(chars)){
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(stringBuilder);
        scanner.close();
    }
}
