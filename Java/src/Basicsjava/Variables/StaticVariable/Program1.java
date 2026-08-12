package Basicsjava.Variables.StaticVariable;


public class Program1 {
    static int num=10;
    static int x;
    public static void main(String[] args) {
      Program1 program1=new Program1();
        System.out.println(program1.num);
        System.out.println(Program1.x);
        System.out.println(Program1.num);
        System.out.println(num);
    }
}
