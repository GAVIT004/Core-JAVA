package Basicsjava.Strings.StringTokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program6 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter....");
        StringTokenizer stringTokenizer=new StringTokenizer(scanner.nextLine());
        System.out.println(stringTokenizer);


        while (stringTokenizer.hasMoreTokens()){
           String word= stringTokenizer.nextToken().toLowerCase();
            int countVowels=0;

            for (int i=0;i<word.length();i++){
               char chars=word.charAt(i);
               if (chars=='a'||chars=='e'||chars=='i'||chars=='o'||chars=='u'){
                   countVowels++;
               }
           }

            System.out.println(word+" = "+countVowels);
        }

        scanner.close();
    }
}
