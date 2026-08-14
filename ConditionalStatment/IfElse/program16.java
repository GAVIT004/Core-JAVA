package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class VoterAge{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18){
			System.out.println(age +"is valid age for voting");
		}else if(age<18){
			System.out.println(age +"is invalid age for voting");
		}else{
			System.out.println("Invalid Input. Please Enter Only Integer Value!!");
		}
	}
}
