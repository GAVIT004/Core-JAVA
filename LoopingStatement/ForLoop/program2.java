package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class WholeNum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a number:");
		int N=sc.nextInt();
		for(int i=0;i<=N;i++){
			System.out.print(i+",");
		}
	}
}
