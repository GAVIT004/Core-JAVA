package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class PatternDemo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a row:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			char ch=65;
			int num=1;
			for(int j=1;j<=row;j++){
				System.out.print(num);
				System.out.print(ch+"\t");
				num++;
				ch++;
			}
			System.out.println();
		}
	}
}
