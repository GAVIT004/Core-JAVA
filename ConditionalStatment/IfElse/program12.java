package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class Table13{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x%13==0){
			System.out.println(x +"is in 13 Table");
		}else if(x%13!=0){
			System.out.println(x +"is Not in 13 Table");
		}else{
			System.out.println("Invalid Input");
		}
	}
}
