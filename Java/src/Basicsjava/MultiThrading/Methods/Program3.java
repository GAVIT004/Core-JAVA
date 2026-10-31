package Basicsjava.MultiThrading.Methods;

class MyThread2 extends Thread{
    static Thread thread;

    @Override
    public void run(){

        try {
            thread.join();
        }catch (InterruptedException interruptedException){

            for (int i=0;i<10;i++){
                System.out.println("Child Thread "+i);
            }
        }
    }
}

public class Program3 {

    public static void main(String[] args)throws InterruptedException {
        MyThread2.thread=Thread.currentThread();
        MyThread2 myThread2=new MyThread2();
        myThread2.start();
       // myThread2.join(); deadlock cause

        for (int i=0;i<10;i++){
            System.out.println("Main Thread "+i);
            Thread.sleep(2000);
        }
    }
}
