package Basicsjava.Strings.String;

//Counstructors of strings

public class Program5 {
    public static void main(String[] args) {
        String string=new String();//it create empty string object
        System.out.println(string);

        String string1=new String("Aditya");
        System.out.println(string1);

        StringBuffer stringBuffer=new StringBuffer();
        String string2=new String(stringBuffer);
        System.out.println(string2);

        StringBuilder stringBuilder=new StringBuilder();
        String string3=new String(stringBuilder);
        System.out.println(string3);

        char[]chars={'A','D','G'};
        String string4=new String(chars);
        System.out.println(string4);

        byte[]bytes={95,96,97,98,99,100};
        String string5=new String(bytes);
        System.out.println(string5);
    }
}
