package Basicsjava.Strings.StringBuilder;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter....");
        StringBuilder stringBuilder=new StringBuilder(scanner.nextLine().trim());
        System.out.println(stringBuilder);

        if(stringBuilder.length()>0&& Character.isLowerCase(stringBuilder.charAt(0))){
            stringBuilder.setCharAt(0,Character.toUpperCase(stringBuilder.charAt(0)));
        }

        for (int i=1;i<stringBuilder.length();i++){

            if (stringBuilder.charAt(i-1)==' ' && Character.isLowerCase(stringBuilder.charAt(i))){
                stringBuilder.setCharAt(
                        i,
                        Character.toUpperCase(stringBuilder.charAt(i))
                );
            }
        }
    }
}
