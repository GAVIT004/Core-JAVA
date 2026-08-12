package Basicsjava.Strings.StringBuffer;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENter ....");
        StringBuffer stringBuffer=new StringBuffer(scanner.nextLine());
        System.out.println(stringBuffer);
        System.out.println("Enter a index to insert...");
        int index=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a text to insert: ");
        String word=scanner.nextLine();
        stringBuffer.insert(index,word);
        System.out.println(stringBuffer);
        scanner.close();
    }
}
