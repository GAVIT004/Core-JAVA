package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class Pattern${
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Rows:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print("$ ");
			}
			System.out.println();
		}
	}
}
