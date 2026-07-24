package Basicsjava.InputOutput;

import java.io.IOException;

public class Program1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        int num=System.in.read();//it gives us askey value
        System.out.println(num+" This is a askey value");
        System.out.println(num-48);


    }
}
