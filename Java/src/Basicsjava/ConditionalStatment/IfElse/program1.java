package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class IfElseDemo{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int x=sc.nextInt();
		if(x>0){
			System.out.println(x +"is Positive");
		}else if(x<0){
			System.out.println(x +"is Negative");
		}else{
			System.out.println(x +"is Zero");
		}
	}
}
