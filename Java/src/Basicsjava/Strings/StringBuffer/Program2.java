package Basicsjava.Strings.StringBuffer;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter....");
        StringBuffer stringBuffer=new StringBuffer(scanner.nextLine());
        System.out.println(stringBuffer);
        System.out.println("Enter...");
        System.out.println(stringBuffer.append(scanner.nextLine()));
    }
}
