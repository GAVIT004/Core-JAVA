package Basicsjava.OOP.Overloading;

public class Program4 {

    public void method1(String string){
        System.out.println("String version");
    }

    public void method1(StringBuffer stringBuffer){
        System.out.println("StringBuffer version");
    }

    public static void main(String[] args) {

        Program4 program4=new Program4();
        program4.method1("Java");
        program4.method1(new StringBuffer("Java"));
       /* program4.method1(null);     Ambiguous method call. Both
                method1
        (String)
                in Program4 and
                method1
        (StringBuffer)
                in Program4 match*/
    }
}
