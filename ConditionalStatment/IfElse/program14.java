package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class CarrerField{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		float per=sc.nextFloat();
		if(per>85.00){
			System.out.println("You can get Medical Field");
		}else if(per<=85.00&&per>75.00){
			System.out.println("You can get a Engineering Field");
		}else if(per<=75.00&&per>=65.00){
			System.out.println("You can get a Pharmacy or Bachelor in science");
		}else{
			System.out.println("Better Luck Next Time!!");
		}
	}
}
		
