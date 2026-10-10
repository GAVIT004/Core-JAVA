package Basicsjava.OOP.MethodSignature;

final  class Test1{
    final private int i;

    Test1(){
        this.i=1;
    }

    public Test1 modify(int i){
        if(this.i==i){
            return this;
        }else {
            return new Test1();
        }
    }

    public static void main(String[] args) {

        Test1 test1=new Test1();
        test1.modify(10);

        Test1 test2=new Test1();
        test2.modify(100);
    }
}

public class Program {


}
