package Basicsjava.PracticeProblem.Assignments.Lab2;

import java.util.*;
public class Program4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++){
			if(i%2==0){
				System.out.println("Even number: "+i);
			}else{
				System.out.println("Odd number: "+i);
			}
		}
	}
}
