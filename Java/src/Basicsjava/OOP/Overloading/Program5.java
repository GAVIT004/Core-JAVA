package Basicsjava.OOP.Overloading;

public class Program5 {

    public void method1(int i,float j){
        System.out.println("Int-float version");
    }

    public void method1(float j, int i){
        System.out.println("Float-int version");
    }

    public static void main(String[] args) {

        Program5 program5=new Program5();
        program5.method1(10,10.5f);
        program5.method1(10.5f,10);
        /*program5.method1(10,10);
        program5.method1(10.5f,10.5f);

        Ambiguous method call. Both
                method1
        (int,
        float)
        in Program5 and
                method1
        (float,
        int)
        in Program5 match*/
    }
}
