package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class Digit3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int N=sc.nextInt();
		for(int i=1;i<=N;i++){
			int sum=99+i;
			System.out.print(sum+",");
		}
	}
}
