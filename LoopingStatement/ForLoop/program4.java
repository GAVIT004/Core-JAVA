package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class EvenNum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a NUmber:");
		int N=sc.nextInt();
		for(int i=1;i<=N;i++){
			if(i%2==0){
				System.out.print(i+",");
			}
		}
	}
}
