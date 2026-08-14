package Basicsjava.Strings.String;

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a something....");
        String something=scanner.nextLine().trim();

        System.out.println(something);
        int numberOfVowels = 0;
        int numberOfCons=0;

        for (int i=0;i<something.length();i++){
            char chars=something.toLowerCase().charAt(i);

            if (chars=='a'||chars=='e'||chars=='i'||chars=='o'||chars=='u'){
                numberOfVowels++;
            } else if (chars>='a'&&chars<='z') {
                numberOfCons++;
            }

        }
        System.out.println("Vowels: "+numberOfVowels);
        System.out.println("Consonants: "+numberOfCons);
    }
}
