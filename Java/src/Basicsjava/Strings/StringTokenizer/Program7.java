package Basicsjava.Strings.StringTokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program7 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter...");
        StringTokenizer stringTokenizer=new StringTokenizer(scanner.nextLine());

        String longestWord="";

        while (stringTokenizer.hasMoreTokens()){
            String word=stringTokenizer.nextToken();

            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }

        if(!longestWord.isEmpty()){
            System.out.println("Longest word: "+longestWord+" Length: "+longestWord.length());
        }else {
            System.out.println("No word found");
        }

        scanner.close();
    }
}
