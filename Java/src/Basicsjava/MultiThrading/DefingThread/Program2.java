package Basicsjava.MultiThrading.DefingThread;

class MyThread1 extends Thread{

    public void run(int i){
        System.out.println("Int-arg run()");
    }

    public void run(){
        System.out.println("No-arg run()");
    }
}

public class Program2 {

    public static void main(String[] args) {

        MyThread1 myThread1=new MyThread1();
        myThread1.start();
    }
}
