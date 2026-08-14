package Basicsjava.Oprators.UnaryOprators;

class Counter{
    void increass(int num){
        System.out.println("Increment: "+ ++num);

    }

    void decrease(int num){
        System.out.println("Drement: "+ --num);
    }
}
public class UnaryOprators1 {
    public static void main(String[]args){
        int num=20;

        Counter counter=new Counter();
        counter.increass(num);
        counter.decrease(num);

    }
}
