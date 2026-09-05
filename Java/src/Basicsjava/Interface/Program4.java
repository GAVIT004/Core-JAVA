package Basicsjava.Interface;

interface Interface5{

    public static final int x=10;
}

public class Program4 {

    public static void main(String[] args) {

       // x=777;  Cannot resolve symbol 'x'

        int x=777;
        System.out.println(x);//777
        System.out.println(Interface5.x);//10
    }
}
