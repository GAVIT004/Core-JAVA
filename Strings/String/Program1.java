package Basicsjava.Strings.String;

public class Program1 {
    public static void main(String[] args) {
        String string=new String("Aditya");
        string.concat("Gavit");
        System.out.println(string);
        System.out.println();

        //here string inmutable so different object is created;
        //In line 6 we dont give refrence variable

        System.out.println("After a declare variable");
        System.out.println();
         string=string.concat("Gavit");
        System.out.println(string);

    }
}
