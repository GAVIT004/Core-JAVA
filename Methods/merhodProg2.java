package Basicsjava.Methods;

import java.util.Scanner;

class Calculater{
    double num1;
    double num2;

    Calculater(double n1,double n2){
        num1=n1;
        num2=n2;
    }

    void addition(){
        System.out.println("Addition: "+(num1+num2));
    }

    void subtraction(double x,double y){

        System.out.println("Subtraction: "+(x-y));
    }

    double multiplication(){
        return num1*num2;
    }

    double divission(double x,double y) {

        if (y == 0) {
            System.out.println("Zero is note valid!!!");
        }
            return x / y;

    }
}

public class merhodProg2 {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a num1:");
         double n1=sc.nextDouble();
         System.out.println("Enter a num2:");
         double n2=sc.nextDouble();
         Calculater cal=new Calculater(n1,n2);
         cal.addition();
         cal.subtraction(n1,n2);
         System.out.println("Multiplication: "+cal.multiplication());
         System.out.println("Divission: "+cal.divission(n1,n2));

     }
}
