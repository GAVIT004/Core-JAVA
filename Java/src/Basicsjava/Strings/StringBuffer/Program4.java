package Basicsjava.Strings.StringBuffer;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a something...");
        StringBuffer stringBuffer=new StringBuffer(scanner.nextLine());
        System.out.println(stringBuffer);
        System.out.println("Enter a index to delete...");
        System.out.println("Enter a start index: ");
        int start=scanner.nextInt();
        System.out.println("Enter a end index: ");
        int end=scanner.nextInt();
        stringBuffer.delete(start,end);
        System.out.println(stringBuffer);
    }
}
