package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class SquarePattern{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a rows:");
		int row=sc.nextInt();
		int num=1;
		int sum=0;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				sum=num*num;
				System.out.print(sum+"\t");
				num++;
			}
			System.out.println();
		}
	}
}
