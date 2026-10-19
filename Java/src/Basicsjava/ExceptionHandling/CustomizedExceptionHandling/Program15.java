package Basicsjava.ExceptionHandling.CustomizedExceptionHandling;

import java.io.PrintWriter;

public class Program15 {

    public static void main(String[] args)throws InterruptedException {

       /* PrintWriter printWriter=new PrintWriter(System.out);
        printWriter.println("Java");*/


       // Thread.sleep(10000);    //Unhandled exception: java.lang.InterruptedException

/*        try {
            Thread.sleep(10000);
        }catch (InterruptedException interruptedException){

        }*/

        Thread.sleep(100000);
    }
}
