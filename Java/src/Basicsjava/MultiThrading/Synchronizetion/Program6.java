package Basicsjava.MultiThrading.Synchronizetion;

public class Program6 {

    public static void main(String[] args) throws InterruptedException {

        ThreadB threadB=new ThreadB();
        threadB.start();
       // Thread.sleep(10000);

        synchronized (threadB){
            System.out.println("Main thread trying to call wait() method");
            threadB.wait();
            System.out.println("Main thread got notification");
            System.out.println(threadB.total);
        }
    }
}

class ThreadB extends Thread{

    int total=0;

    @Override
    public void run(){

        synchronized (this){

            System.out.println("Child thread starts calculations");

            for (int i=0;i<10;i++){
                total=total+i;
            }
            System.out.println("Child thread trying to give notification");
            this.notify();
        }
    }
}
