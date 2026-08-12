package Basicsjava.AccessModifiers.MemberLevelModifiers.Pack2;

public class Program3 {

    protected void method1(){
        System.out.println("Protected method()");
    }
}

class AccessingProtected{

    public static void main(String[] args) {

        Program3 program3=new Program3();
        program3.method1();
    }
}
