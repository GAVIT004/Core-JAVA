package Basicsjava;

import java.util.Scanner;

class Calculator{
    double num1;
    double num2;
    String opration;

    Calculator(double n1,String opr,double n2){
        num1=n1;
        opration=opr;
        num2=n2;

    }

    void addition(){
        System.out.println("Addition = "+(num1+num2));
    }
    void subtraction(){
        System.out.println("Subtraction = "+(num1-num2));
    }
    void multiplication(){
        System.out.println("Multiplication= "+(num1*num2));
    }
    void division(){
        System.out.println("Division = "+(num1/num2));
    }





}

public class Practiceprog6 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num1:");
        double n1=scanner.nextDouble();
        System.out.println("Enter a oprator:");
        String opr= scanner.next();
        System.out.println("Enter num2:");
        double n2=scanner.nextDouble();
        Calculator cal=new Calculator(n1,opr,n2);
        System.out.println("Answer: ");
        if(opr.equals("+")){
            cal.addition();
        } else if (opr.equals("-")) {
           cal.subtraction();
        } else if (opr.equals("*")) {
            cal.multiplication();

        } else if (opr.equals("/")) {
            if(n2==0){
                System.out.println("Number cannot have zero");
            }else {
                cal.division();
            }

        }else {
            System.out.println("Invalid Input");
        }


    }
}
