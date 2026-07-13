package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class CBAPattern{
	public static void main(String[]arsg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a rows:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			char ch= (char) (96+row);
			for(int j=1;j<=row;j++){
				System.out.print(ch+"\t");
				ch--;
			}
			System.out.println();
		}
	}
}
