package Basicsjava.MultiThrading.ConstructorsInMultiThreading;

import javax.swing.plaf.TableHeaderUI;

public class Program1{

    public static void main(String[] args) {

        Runnable runnable=()->{
            System.out.println("Task running on: "+Thread.currentThread().getName());
        };

        Thread thread=new Thread();

        Thread thread1=new Thread(runnable);

        Thread thread2=new Thread("Student-3");

        Thread thread3=new Thread(runnable,"Student-4");

        ThreadGroup threadGroup=new ThreadGroup("Student Team");

        Thread thread4=new Thread(threadGroup,"Student-5");

        Thread thread5=new Thread(threadGroup,runnable);

        Thread thread6=new Thread(threadGroup,runnable,"Student-6");

        Thread thread7=new Thread(threadGroup,runnable,"Student-7",0);

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
    }
}
