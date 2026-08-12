package Basicsjava.Strings.String;

//String methods();

public class Program6 {
    public static void main(String[] args) {
        String string="Aditya";
        System.out.println(string.charAt(3));//t
        //System.out.println(string.charAt(7));it gives stringIndexOutOfBoundsException

        System.out.println(string.concat(" Gavit"));
        string=string+" Dinesh Gavit ";
        System.out.println(string);
        string+=" NDB";
        System.out.println(string);

       String string1="Aditya";
       System.out.println(string1.equals("ADItya"));//false
        System.out.println(string1.equals("Aditya"));//true
        System.out.println(string1.equalsIgnoreCase("aditya"));//true
        System.out.println(string1.isEmpty());//false
        System.out.println(string1.length());//6
        System.out.println(string1.replace('a','d'));
        System.out.println(string1.substring(3));
        System.out.println(string1.substring(1,4));
        System.out.println(string.indexOf('g'));
        System.out.println(string.indexOf('A'));
        System.out.println(string.lastIndexOf("a"));
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());

        String string2="   Aditya    ";
        System.out.println(string2.length());
        System.out.println(string2.trim().length());

        String string3="Aditya Gavit";
        System.out.println(string3.length());
        System.out.println(string3.trim().length());


    }
}
