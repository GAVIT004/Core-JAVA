package Basicsjava.OOP.Constructor;

public class Program2 {

    static int count=0;

    {
        count++;
    }

    Program2(){
        //count++;
    }

    Program2(int num){
        //count++;
    }

    Program2(double num){
        //count++;
    }

    public static void main(String[] args) {

        Program2 program2=new Program2();
        Program2 program2_1=new Program2(10);
        Program2 program2_2=new Program2(10.5);

        System.out.println("Count of object creation: "+count);
    }

}
