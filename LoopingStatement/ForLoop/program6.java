package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class ReverseOrder{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int N=sc.nextInt();
		for(int i=N;i>=10;i--){
			System.out.print(i+",");
		}
	}
}
