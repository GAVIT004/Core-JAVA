package Basicsjava.MultiThrading.Synchronizetion;

class Display3{

    public void wish(String name){

        // 1 lakh lines code

        synchronized (this){

            for (int i=0;i<10;i++){

                System.out.println("Good Morning: "+name);

                try {

                    Thread.sleep(2000);
                }catch (InterruptedException interruptedException){

                    System.out.println(name);
                }
            }
        }
        // 1 lakh line code
    }
}

class MyThread4 extends Thread{

    Display3 display3;
    String name;

    MyThread4(Display3 display3,String name){
        this.display3=display3;
        this.name=name;
    }

    public void run(){

        display3.wish(name);
    }
}

public class Program4 {

    public static void main(String[] args) {

        Display3 display3=new Display3();

        MyThread4 myThread4=new MyThread4(display3,"Dhoni");
        MyThread4 myThread5=new MyThread4(display3,"YuvRaj");
        myThread4.start();
        myThread5.start();
    }
}
