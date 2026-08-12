package Basicsjava.Variables.StaticVariable;

public class Program3 {
    static int x=10;
    int y=20;

    public static void main(String[] args) {
        Program3 program3=new Program3();
        program3.x=888;
        program3.y=999;
        Program3 program4=new Program3();
        System.out.println(program4.x+"....."+program4.y);
    }
}
