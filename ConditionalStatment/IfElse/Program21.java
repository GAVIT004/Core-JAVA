package Basicsjava.ConditionalStatment.IfElse;

import java.util.Scanner;

public class Program21 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("----Please enter your marks: -----");
        int marks=sc.nextInt();
        if(marks<35){
            System.out.println("Fail!!!");
        } else if (marks>=35 && marks<60) {
            System.out.println("Pass with second class");
        } else if (marks>=60 && marks<75) {
            System.out.println("pass with first class");
        } else if (marks>=75&&marks<=90) {
            System.out.println("pass with first class distivtion");
        } else if (marks>90&&marks<=100) {
            System.out.println("pass with merit list");
        }else {
            System.out.println("Please enter valid marks!!!");
        }
    }
}
