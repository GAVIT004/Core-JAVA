package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class PatternDemo2 {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a rows:");
		int row=sc.nextInt();
		char ch=65;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(ch+"\t");
				ch++;
			}
			System.out.println();
		}
	}
}
