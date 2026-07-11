package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class Movies{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a movie name :");
		String Movie=sc.next();
		System.out.println("Enter Rating");
		float rating=sc.nextFloat();
		if(rating>=9 && rating<10){
			System.out.println("Truelu cinematic Masterpiece");
		}else if(rating>=7 && rating<9){
			System.out.println("Masterpiece");
		}else if(rating>=5 && rating<7){
			System.out.println("Good");
		}else if(rating>5){
			System.out.println("Ok OK");
		}
	}
}

