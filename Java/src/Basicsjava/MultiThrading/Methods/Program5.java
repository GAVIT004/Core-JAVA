package Basicsjava.MultiThrading.Methods;

class MyThread3 extends Thread{

    @Override
    public void run(){

        try {

            for (int i=0;i<10;i++){
                System.out.println("I am lazy thread");
                Thread.sleep(2000);
            }
        }catch (InterruptedException interruptedException){
            System.out.println("I got interrupted");
        }
    }
}

public class Program5 {

    public static void main(String[] args) {
        MyThread3 myThread3=new MyThread3();
        myThread3.start();
        //myThread3.interrupt();
        System.out.println("End of main thread");
    }
}
