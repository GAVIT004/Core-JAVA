package Basicsjava.MultiThrading.DefingThread;

class MyThread4 extends Thread{

    public void run(){
        System.out.println("Child thread");
    }
}

public class Program6 {

    public static void main(String[] args) {

        MyThread4 myThread4=new MyThread4();
        Thread thread=new Thread(myThread4);
        thread.start();
        System.out.println("Main thread");
    }
}
