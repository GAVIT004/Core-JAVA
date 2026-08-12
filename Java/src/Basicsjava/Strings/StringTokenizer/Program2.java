package Basicsjava.Strings.StringTokenizer;

import java.util.StringTokenizer;

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Using StringTokenizer Constrictor 1: ");
        StringTokenizer stringTokenizer1=new StringTokenizer("Blood to Blood"," ");
        while (stringTokenizer1.hasMoreTokens()) {
            System.out.println(stringTokenizer1.nextToken());
        }
        System.out.println("Using StringTokenizer Constructor 2: ");
        StringTokenizer stringTokenizer2=new StringTokenizer("Java : Code : String : Tokenizer",":");
        while (stringTokenizer2.hasMoreTokens()){
            System.out.println(stringTokenizer2.nextToken());
        }
        System.out.println("Using StringTokenizer Constructor 3: ");
        StringTokenizer stringTokenizer3=new StringTokenizer("Java : Code ",":",true);
        while (stringTokenizer3.hasMoreTokens()){
            System.out.println(stringTokenizer3.nextToken());
        }
    }
}
