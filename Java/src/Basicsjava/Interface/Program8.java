package Basicsjava.Interface;

interface Left3{

    public static final int num=5;
}

interface Right3{

    public static final int num=6;
}

public class Program8 implements Left3,Right3 {

    public static void main(String[] args) {

       // System.out.println(num);   reference to 'num' is ambiguous, both 'Left3.num' and 'Right3.num' match
        System.out.println(Left3.num);
        System.out.println(Right3.num);
    }
}
