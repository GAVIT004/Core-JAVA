package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class Reverse140{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int N=sc.nextInt();
		for(int i=140;i>=N;i--){
			System.out.print(i+",");
		}
	}
}
