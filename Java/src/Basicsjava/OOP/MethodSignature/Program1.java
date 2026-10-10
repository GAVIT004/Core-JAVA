package Basicsjava.OOP.MethodSignature;

class Test{

    public static int method1(int i,float f){
        return 0;
    }

    public void method2(int i){

    }

    public void method3(String s){

    }
}

public class Program1 {

    public static void main(String[] args) {

        Test test=new Test();
        test.method2(10);
        test.method3("Java");
        //test.method4(10.5); Cannot resolve method 'method4' in 'Test'
    }
}
