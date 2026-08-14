package Basicsjava.Oprators;

class MathOprations{


    void square(int n){
        System.out.println("Square: "+n*n);
    }

    void cube(int n){
        System.out.println("Cube: "+n*n*n);
    }

}
public class ArthematicOprators1 {
    public static void main(String[]args){
        int num=4;
        MathOprations mathOprations=new MathOprations();
        mathOprations.square(num);
        mathOprations.cube(num);
    }

}
