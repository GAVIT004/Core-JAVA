package Basicsjava.Strings.StringTokenizer;

import java.util.StringTokenizer;

public class Program3 {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer=new StringTokenizer("Welcome to sebs");
        StringTokenizer stringTokenizer1=new StringTokenizer("");
        int count=stringTokenizer.countTokens();
        System.out.println(count);
        System.out.println("Welcome to sebs: "+stringTokenizer.hasMoreTokens());
        System.out.println("(Empty String): "+stringTokenizer1.hasMoreTokens());
        System.out.println("Travesing the String: ");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextElement());
        }
    }
}
