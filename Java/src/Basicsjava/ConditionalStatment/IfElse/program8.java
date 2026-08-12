package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class MaxOrMin{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>y){
			System.out.println(x +"is Grater"+ y);
		}else if(x<y){
			System.out.println(x +"is Lower " + y);
		}else{
			System.out.println("Invalid Input");
		}
	}
}
