package Basicsjava.MultiThrading.Synchronizetion;

class MyThreadA{

    public synchronized void display1(MyThreadB myThreadB){

        System.out.println("Thread1 start execution of display1 method");

        try {

            Thread.sleep(3000);
        } catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
        }
        System.out.println("Thread1 trying to call MyThreadB losk() method");

        myThreadB.last();
    }

    public synchronized void last(){
        System.out.println("Invalid MyThreadA last method");
    }

}

class MyThreadB{

    public synchronized void display2(MyThreadA myThreadA){

        System.out.println("Thread2 start execution of display2 method");

        try {

            Thread.sleep(5000);
        } catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
        }
        System.out.println("Thread2 trying to call MyThreadA lock() method");

        myThreadA.last();
    }

    public synchronized void last(){

        System.out.println("Invalid MyThreadB last() method");
    }
}

public class Program7 extends Thread{

        MyThreadA myThreadA=new MyThreadA();
        MyThreadB myThreadB=new MyThreadB();

        public void method1(){
            this.start();
            myThreadA.display1(myThreadB);
        }

        @Override
        public void run(){

            myThreadB.display2(myThreadA);
        }

    public static void main(String[] args) {

            Program7 program7=new Program7();
            program7.method1();
    }
}
