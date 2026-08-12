package Basicsjava.LoopingStatement.ForLoop;

import java .util.*;
class RowsDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a rows:");
		int row=sc.nextInt();
		int num=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
			num--;
		}
	}
}
