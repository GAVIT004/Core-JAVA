package Basicsjava.OOP.SingletonClass;

 public class Program1 {

    private static Program1 program1= new Program1();

    private Program1(){

    }

    public static Program1 getInstance(){
        return program1;
    }
}
