package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class Distinction{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		float per=sc.nextFloat();
		if(per>75.00){
			System.out.println("First class with distinction");
		}else if(per>=60.00 && per<75.00){
			System.out.println("Passed: first class");
		}else if(per>=54.00 && per<60.00){
			System.out.println("Passed : Second class");
		}else if(per>=47.00 && per<54.00){
			System.out.println("pass:");
		}else{
			System.out.println("Fail!!!");
		}
	}
}
