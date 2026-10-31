package Basicsjava.MultiThrading.Methods;

public class Program4 {

    public static void main(String[] args) throws InterruptedException{
        Thread.currentThread().join();//deadlock
    }
}
