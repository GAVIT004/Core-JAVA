package Basicsjava.MultiThrading.ThreadPriority;

class MyThread3 extends Thread{

    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println("Child thread");
        }
    }
}

public class Program3 {

    public static void main(String[] args) {

        MyThread3 myThread3=new MyThread3();
        myThread3.setPriority(10);
        myThread3.start();
        for (int i=0;i<=5;i++){
            System.out.println("Main thread");
        }
    }
}
