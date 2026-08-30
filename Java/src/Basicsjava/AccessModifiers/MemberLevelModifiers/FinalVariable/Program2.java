package Basicsjava.AccessModifiers.MemberLevelModifiers.FinalVariable;

public class Program2 {

   // final static int x; Field 'x' might not have been initialized

    final static int x=10;

    final static int y;
    static {
        y=20;
    }

   /* final static int z;
    public void m1(){
        z=30;   Cannot assign a value to final variable 'z'
    }*/



}
