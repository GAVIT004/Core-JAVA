package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class DivisibleBy7{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		if(x%7==0){
			System.out.println(x +"is Divisible By 7");
		}else if(x%7!=0){
			System.out.println(x +"is Not Divisible By 7");
		}else{
			System.out.println("Invalid Input");
		}
	}
}
