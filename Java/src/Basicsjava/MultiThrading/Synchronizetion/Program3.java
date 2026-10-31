package Basicsjava.MultiThrading.Synchronizetion;

class Display2{

    public synchronized void displayn(){

        for (int i=0;i<10;i++){
            System.out.println(i);

            try {
                Thread.sleep(2000);
            }catch (InterruptedException interruptedException0){

            }
        }
    }

    public synchronized void displayc(){

        for (int i=65;i<=75;i++){
            System.out.println((char) i);

            try {
                Thread.sleep(2000);
            }catch (InterruptedException interruptedException){

            }
        }
    }
}

class MyThread2 extends Thread{
    Display2 display2;

    MyThread2(Display2 display2){
        this.display2=display2;
    }

    @Override
    public void run(){
        display2.displayn();
    }
}

class MyThread3 extends Thread{
    Display2 display2;

    MyThread3(Display2 display2){
        this.display2=display2;
    }

    @Override
    public void run(){
        display2.displayc();
    }
}

public class Program3 {

    public static void main(String[] args) {
        Display2 display2=new Display2();
        MyThread2 myThread2=new MyThread2(display2);
        MyThread3 myThread3=new MyThread3(display2);
        myThread2.start();
        myThread3.start();
    }
}
