package Basicsjava.Strings.String;

import java.util.Scanner;

public class Program22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word=scanner.next().trim().toLowerCase();
        String reverse="";

        for (int i=word.length()-1;i>=0;i--){
            reverse += word.charAt(i);
        }

        if(word.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
        scanner.close();
    }
}
