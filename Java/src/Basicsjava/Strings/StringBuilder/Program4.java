package Basicsjava.Strings.StringBuilder;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter ...");
        StringBuilder stringBuilder=new StringBuilder(scanner.nextLine().trim().toLowerCase());
        System.out.println(stringBuilder);
        for (int i=0;i<stringBuilder.length();i++){
            char chars=stringBuilder.charAt(i);
            if (chars=='a'||chars=='e'||chars=='i'||chars=='o'||chars=='u'){
                stringBuilder.setCharAt(i,'*');
            }
        }
        System.out.println(stringBuilder);
        scanner.close();
    }
}
