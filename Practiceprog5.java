package Basicsjava;

import java.util.Scanner;

class Studentditail{
    String stdName;
    int stdAge;

    Studentditail(String name,int age){
        stdName=name;
        stdAge=age;
    }

    void displaystd(){
        System.out.println("Student Name: "+stdName);
        System.out.println("Student Age: "+stdAge);
    }


}

public class Practiceprog5 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a student name:");
        String name=scanner.next();
        System.out.println("Enter a student age: ");
        int age=scanner.nextInt();
        Studentditail std=new Studentditail(name,age);
        std.displaystd();


    }

}
