package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class PatternforNested{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a row:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int num=row-i+1;
			for(int j=1;j<=row;j++){
				System.out.print(num+"\t");
				num=num+row;
			}
			System.out.println();
		}
	}
}
