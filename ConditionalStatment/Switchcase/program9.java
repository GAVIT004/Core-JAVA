package Basicsjava.ConditionalStatment.Switchcase;

import java.util.*;
class Result{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Subject1 Marks");
		float sub1=sc.nextFloat();
		System.out.println("Enter Subject2 Marks");
		float sub2=sc.nextFloat();
		System.out.println("Enter Subject3 Marks");
		float sub3=sc.nextFloat();
		System.out.println("Enter Subject4 Marks");
		float sub4=sc.nextFloat();
		System.out.println("Enetr subject5 Marks");
		float sub5=sc.nextFloat();
		float sum=sub1+sub2+sub3+sub4+sub5;
		float avg=sum/5;
		char grade;
		if(avg>=90){
			 grade='O';
		}else if(avg>=80 && avg<=90){
			 grade='A';
		}else if(avg>=70 && avg<=80){
			 grade='B';
		}else if(avg>=60 && avg<=70){
			 grade='C';
		}else if(avg>=50 && avg<=60){
			 grade='D';
		}else if(avg>=40 && avg<=50){
			 grade='E';
		}else{
			 grade='F';
		}
		switch( grade){
			case 'O':
				System.out.println(grade+" Outstanding");
				break;
			case 'A':
				System.out.println(grade+" Excellent");
				break;
			case 'B':
				System.out.println(grade+" Best");
				break;
			case 'C':
				System.out.println(grade+" Better");
				break;
			case 'D':
				System.out.println(grade+" Good");
				break;
			case 'E':
				System.out.println(grade+" Passed");
				break;
			case 'F':
				System.out.println(grade+" Failed!!");
				break;
		}

	}
}
