package Basicsjava.MultiThrading.DefingThread;

class MyThread extends Thread{

    public void run(){
        for (int i=0;i<10;i++) {
            System.out.println("Child Thread");
        }//Job executed by child thread
    }
}

public class Program1 {

    public static void main(String[] args) {

        MyThread myThread=new MyThread();//Thread installation
        myThread.start();//Starting of a Thread

        for (int i=0;i<10;i++) {
            System.out.println("Main Thread");
        }//Job executed by Main thread
    }
}
