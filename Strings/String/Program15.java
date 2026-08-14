package Basicsjava.Strings.String;

public class Program15 {
    public static void main(String[] args) {
        String string1="Java";
        String string2=new String("java");
        String  string3=string2;
        if(string1==string3)
            System.out.println("True");
        else
            System.out.println("False");
        if(string1.equalsIgnoreCase(string2))
            System.out.println("True");
        else
            System.out.println("False");
        if(string1.equals(string3))
             System.out.println("True");
        else
            System.out.println("False");
        if(string1.toLowerCase()==string2.toLowerCase()){
            System.out.println("True");
        } else
            System.out.println("False");
    }
}
