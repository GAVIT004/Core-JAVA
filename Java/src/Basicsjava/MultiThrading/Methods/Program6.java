package Basicsjava.MultiThrading.Methods;

class MyThread4 extends Thread{

    @Override
    public void run(){

        for (int i=0;i<10000;i++){
            System.out.println("I am lazy thread"+i);
        }

        System.out.println("I am entering into sleeping state");

        try{
            Thread.sleep(10000);
        }catch (InterruptedException interruptedException){
            System.out.println("I got interrupted");
        }
    }
}

public class Program6 {

    public static void main(String[] args) {
        MyThread4 myThread4=new MyThread4();
        myThread4.start();
        myThread4.interrupt();
        System.out.println("End of main thread");
    }
}
