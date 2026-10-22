package Basicsjava.MultiThrading.ThreadPriority;

class MyThread1 extends Thread{

}

public class Program2 {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());

      /*  Thread.currentThread().setPriority(15);Exception in thread "main" java.lang.IllegalArgumentException
        at java.base/java.lang.Thread.setPriority(Thread.java:1138)
        at Basicsjava.MultiThrading.ThreadPriority.Program2.main(Program2.java:13)*/

        Thread.currentThread().setPriority(7);

        MyThread1 myThread1=new MyThread1();
        System.out.println(myThread1.getPriority());

    }
}
