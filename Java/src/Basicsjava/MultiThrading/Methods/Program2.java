package Basicsjava.MultiThrading.Methods;

class MyThread1 extends Thread{

    @Override
    public void run(){

        for (int i=0;i<10;i++){
            System.out.println("Seethe Thread");

            try {
                Thread.sleep(2000);
            }catch (InterruptedException interruptedException){

            }
        }
    }
}

public class Program2 {

    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1=new MyThread1();
        myThread1.start();
        myThread1.join(1000,100);

        for (int i=0;i<10;i++){
            System.out.println("Rama Thread");
        }
    }
}
