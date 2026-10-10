package Basicsjava.OOP.SingletonClass;

public class Program2 {

    private static Program2 program2=null;

    private Program2(){

    }

    public static Program2 getProgram2(){
        if(program2==null){
            program2=new Program2();
        }

        return program2;
    }
}
