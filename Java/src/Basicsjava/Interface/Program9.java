package Basicsjava.Interface;

import java.util.Scanner;

public class Program9 implements Cloneable{

    private String name;
    private int age;
    private String address;

    public Program9(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void register(){
        System.out.println("Register Student : Name - "+ name + ", Address - " + address + ", Age -" + age);
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name= scanner.next();
        System.out.println("Enter Student Age: ");
        int age= scanner.nextInt();
        System.out.println("Enter Student Address: ");
        String address=scanner.next();

        Program9 program9=new Program9(name,age,address);
        Program9 newprogram9=(Program9) program9.clone();
        newprogram9.register();
    }
}
