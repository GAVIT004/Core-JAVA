package Basicsjava.Strings.StringBuilder;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a something...");
        StringBuilder stringBuilder=new StringBuilder(scanner.nextLine().trim());
        System.out.println(stringBuilder);
        for (int i=0;i<stringBuilder.length();i++){
            for (int j=i+1;j<stringBuilder.length();j++){
                if(stringBuilder.charAt(i)==stringBuilder.charAt(j)){
                    stringBuilder.deleteCharAt(j);
                    j--;
                }
            }
        }
        System.out.println(stringBuilder);
        scanner.close();
    }
}
