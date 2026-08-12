package Basicsjava.PracticeProblem.Assignments.Lab2;

import java.util.*;
public class Program8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year=sc.nextInt();
		if((year%4==0&&year%100!=0)||(year%400==0)){
			System.out.println("The year "+year+" is leap year");
		}else{
			System.out.println("The year "+year+" is not a leap year");
		}
	}
}
