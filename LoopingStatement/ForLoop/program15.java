package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class PatternRows {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a rows:");
		int row=sc.nextInt();

		System.out.println("Enter a number ");
		int num=sc.nextInt();

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){
				System.out.print(num+" ");
			        }
			System.out.println();
			num++;
		}
	}
}
