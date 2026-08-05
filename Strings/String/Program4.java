package Basicsjava.Strings.String;

public class Program4 {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Aditya");
        StringBuffer stringBuffer1=new StringBuffer("Aditya");
        System.out.println(stringBuffer==stringBuffer1);
        System.out.println(stringBuffer.equals(stringBuffer1));
    }
}
