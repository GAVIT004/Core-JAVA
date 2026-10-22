package Basicsjava.MultiThrading.DefingThread;

class MyRunnable implements Runnable{

    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Child thread "+i);
        }//Job executed by child thread
    }
}

public class Program5 {

    public static void main(String[] args) {

        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();
        System.out.println("Main thread");
    }
}
