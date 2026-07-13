package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class OddNum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int N=sc.nextInt();
		for(int i=1;i<=N;i++){
			if(i%2==1){
				System.out.print(i+",");
			}
		}
	}
}
