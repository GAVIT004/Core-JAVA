package Basicsjava.Strings.String;

public class Program11 {
    public static void main(String[] args) {
        String s="A";
        s=s.concat("B");
        String string="C";
        s=s.concat(string);
        s.replace('C','D');
        s=s.concat(string);
        System.out.println(s);
    }
}
