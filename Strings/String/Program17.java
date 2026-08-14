package Basicsjava.Strings.String;

//methodh of StringBuffer
public class Program17 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Aditya");
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.charAt(4));
        stringBuffer.setCharAt(0,'a');
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.append("gavit"));
        System.out.println(stringBuffer.insert(6,' '));
        System.out.println(stringBuffer.delete(6,10));
        stringBuffer.deleteCharAt(6);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
        stringBuffer.setLength(5);
        System.out.println(stringBuffer);
        stringBuffer.ensureCapacity(2);
        System.out.println(stringBuffer);
        stringBuffer.trimToSize();
    }
}
