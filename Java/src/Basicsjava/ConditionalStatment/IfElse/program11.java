package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class Range1To1000{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	if(x>=1 && x<=1000){
		System.out.println(x +"is Between 1 To 1000");
	}else if(x<=0 && x>1000){
		System.out.println(x +"is Out Of Range");
	}else {
		System.out.println("Invalid Input");
	}
	}
}
