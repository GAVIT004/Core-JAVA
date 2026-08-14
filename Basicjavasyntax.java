package Basicsjava;

public class Basicjavasyntax {

    void method1(){
        System.out.println("Welcome to java");
    }

    void addition(int a, int b){
        int c=a+b;
        System.out.println(c);


    }

    int multiplication(){
        return 0;
    }

    double subtraction(int a , int b){
        int result = a - b ;
        System.out.println(result);
        return 55.5;
    }

    String getName(){
        String name="Gaviiiiit";
        System.out.println(name);
        return name;
    }
}







class ABCD{
    public static void main(String[] args) {
        Basicjavasyntax obj = new Basicjavasyntax();

        obj.method1();

        obj.addition(10,20);
        obj.multiplication();
        obj.subtraction(10,5);
        obj.getName();








    }
}