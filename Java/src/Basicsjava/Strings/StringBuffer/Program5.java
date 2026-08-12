package Basicsjava.Strings.StringBuffer;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter....");
        StringBuffer stringBuffer=new StringBuffer(scanner.nextLine());
        System.out.println(stringBuffer);
        System.out.println("Enter a old word: ");
        String oldWord=scanner.nextLine();
        System.out.println("Enter a new word: ");
        String newWord=scanner.nextLine();

        int index=stringBuffer.indexOf(oldWord);

        if (index!=1){
            stringBuffer.replace(index,index+oldWord.length(),newWord);
            System.out.println(stringBuffer);
        }else {
            System.out.println("Word not found!!!");
        }
        scanner.close();
    }
}
