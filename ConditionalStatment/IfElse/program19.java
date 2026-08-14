package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class Pytha{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a*a+b*b==c*c){
			System.out.println("Condition satisfy");
		}else if(a*a+c*c==b*b){
			System.out.println("Condition satisfy");
		}else if(b*b+c*c==a*a){
			System.out.println("condition Satisfy");
		}else{
			System.out.println("Condition not satisfy");
		}
	}
}
