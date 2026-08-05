package Basicsjava.Strings.String;

public class Program7 {
    public static void main(String[] args) {
        String string=new String("aditya");
        String string1=string.toUpperCase();//ADITYA
        String  string2=string.toLowerCase();//aditya
        System.out.println(string==string1);//false
        System.out.println(string==string2);//true
    }
}
