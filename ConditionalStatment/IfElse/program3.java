package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class LessORGreater{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x>10){
			System.out.println(x +"is Greater Than 10");
		}else if(x<10){
			System.out.println(x +"is Less Than 10");
		}else{
			System.out.println(x +"is Ten");
		}
	}
}
