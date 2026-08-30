package Basicsjava.AccessModifiers.MemberLevelModifiers.FinalVariable;


//final instance variable
public class Program1 {

    //final int x;    Field 'x' might not have been initialized



    public static void main(String[] args) {
        final int x=10;
        System.out.println(x);
    }

    final int x;
    {
        x=10;
    }

    final int y;
    Program1(){
        y=10;
    }

    /*final int x;
    public void m1(){
        x=10;   Cannot assign a value to final variable 'x'
    }*/

}
