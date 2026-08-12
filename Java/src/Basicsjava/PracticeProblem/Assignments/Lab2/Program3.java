package Basicsjava.PracticeProblem.Assignments.Lab2;

import java.util.Scanner;
public class Program3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1=sc.nextInt();
		System.out.print("Enter number 2: ");
		int num2=sc.nextInt();
		if(num1>num2){
			 System.out.print("The biggest number is: "+num1);
		}else if(num1<num2){
			  System.out.print("The biggest number is: "+num2);
		}else{
			  System.out.print("Both number are equal");
		}
		sc.close();
	}
}
