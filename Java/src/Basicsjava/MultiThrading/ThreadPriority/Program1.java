package Basicsjava.MultiThrading.ThreadPriority;

class MyThread extends Thread{

}

public class Program1 {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        MyThread myThread=new MyThread();
        System.out.println(myThread.getName());

        Thread.currentThread().setName("MyThread");
        System.out.println(Thread.currentThread().getName());
    }
}
