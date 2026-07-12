package Basicsjava.ConditionalStatment.Switchcase;

import java.util.*;
class EvenOdd{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1");
		int num1=sc.nextInt();
		System.out.println("Enter Num2");
		int num2=sc.nextInt();
		if(num1>=0 && num2>=0 ){
			System.out.println("Number are positive");
		}else{
			System.out.println("Number is negative please enter a positive number");
		}
		int product=num1*num2;
		switch(product%2){
			case 0:
				System.out.println(product+"is even");
				break;
			case 1:
				System.out.println(product+"is odd");
				break;
			default:
				System.out.println(product+"is Negative number");
		}
	}
}

