package Basicsjava.MultiThrading.DefingThread;

class MyThread3 extends Thread{

    public void start(){
        super.start();
        System.out.println("Start()");
    }

    public void run(){
        System.out.println("Run()");
    }
}

public class Program4 {

    public static void main(String[] args) {

        MyThread3 myThread3=new MyThread3();
        myThread3.start();
        System.out.println("Main Thread");
    }
}
