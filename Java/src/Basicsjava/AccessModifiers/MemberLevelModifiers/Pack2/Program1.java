package Basicsjava.AccessModifiers.MemberLevelModifiers.Pack2;

public class Program1 {

    void method1(){
        System.out.println("Default method()");

    }

}

class AccessingDefault{

    public static void main(String[] args) {

        Program1 program1=new Program1();
        program1.method1();
    }
}
