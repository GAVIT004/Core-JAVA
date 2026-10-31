package Basicsjava.MultiThrading.Synchronizetion;

class Display{

    public synchronized void wish(String name){

        for (int i=0;i<10;i++){
            System.out.println("Good Morning:"+name);

            try {
                Thread.sleep(2000);
            }catch (InterruptedException interruptedException){
                System.out.println(name);
            }
        }
    }
}

class MyThread extends Thread{

    Display display;
    String name;

    MyThread(Display display,String name){
        this.display=display;
        this.name=name;
    }

    @Override
    public void run(){
        display.wish(name);
    }
}

public class Program1 {

    public static void main(String[] args) {
        Display display=new Display();
        MyThread myThread=new MyThread(display,"Dhoni");
        MyThread myThread1=new MyThread(display,"YuvRaj");
        myThread.start();
        myThread1.start();
    }
}
