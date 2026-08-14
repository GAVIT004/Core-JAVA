package Basicsjava.Strings.StringBuilder;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter.....");
        StringBuilder stringBuilder=new StringBuilder(scanner.nextLine());
        System.out.println(stringBuilder);

        for (int i=0;i<stringBuilder.length();i++){
            char ch=stringBuilder.charAt(i);

            if( Character.isUpperCase(ch)){
                ch=Character.toLowerCase(ch);
                stringBuilder.setCharAt(i,ch);
            } else if (Character.isLowerCase(ch)) {
                ch=Character.toUpperCase(ch);
                stringBuilder.setCharAt(i,ch);
            }

        }

        System.out.println(stringBuilder);
        scanner.close();
    }
}
