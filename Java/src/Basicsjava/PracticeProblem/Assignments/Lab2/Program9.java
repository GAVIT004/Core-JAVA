package Basicsjava.PracticeProblem.Assignments.Lab2;


import java.util.Scanner;

public class Program9{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number 1:  ");
		int num1=scanner.nextInt();
		System.out.print("Enter number 2:  ");
		int num2=scanner.nextInt();
		System.out.print("Enter number 3:  ");
		int num3=scanner.nextInt();
		int largest=num1;
		if(num2>largest){
			largest=num2;
		} else if (num3>largest) {
			largest=num3;
		}
		System.out.println("The  largest number is "+largest);
	}
}
