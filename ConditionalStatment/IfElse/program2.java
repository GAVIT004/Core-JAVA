package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class EvenOrOdd{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x%2==0){
			System.out.println(x +" is Even");
		}else if(x%2!=0){
			System.out.println(x +" is Odd");
		}else{
			System.out.println("Invalid Input");
		}
	}
}


