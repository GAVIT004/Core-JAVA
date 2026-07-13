package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class StringPattern{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number of Rows:");
		int row=sc.nextInt();
		System.out.println("Enter aString:");
		String s=sc.next();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}
}
