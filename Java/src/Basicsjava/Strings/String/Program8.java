package Basicsjava.Strings.String;

public class Program8 {
    public static void main(String[] args) {
        String string="aditya";
        String string1=string.toString();//aditya
        String string2=string.toLowerCase();//aditya
        String string3=string.toUpperCase();//ADITYA
        System.out.println(string==string1);//true
        System.out.println(string==string2);//true
        System.out.println(string==string3);//false
    }
}
