package Basicsjava.Strings.StringTokenizer;

import java.util.StringTokenizer;

public class Program1 {
    public static void main(String[] args) {
        String s="Hello how are you";
        StringTokenizer stringTokenizer=new StringTokenizer(s);
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
