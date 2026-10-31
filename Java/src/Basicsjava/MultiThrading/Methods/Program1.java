package Basicsjava.MultiThrading.Methods;

class MyThread extends Thread{

    @Override
    public void run(){

        for (int i=0;i<10;i++){
            System.out.println("Child Thread "+i);
            Thread.yield();
        }
    }
}

public class Program1 {

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();

        for (int i=0;i<10;i++){
            System.out.println("Main Thread "+i);
        }
    }
}
