package Basicsjava.Strings.String;

//StringBuffer Capacity
public class Program16 {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("qwertyuiopasdfgh");
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("qwertyuiopasdfghj");
        System.out.println(stringBuffer.capacity());

    }
}
