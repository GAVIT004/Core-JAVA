package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class CharNumPattern{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a row:");
		int row=sc.nextInt();
		int num;
		char ch;
		for(int i=1;i<=row;i++){
			if(i%2==1){
				num=1;
				ch='A';
			}else{
				num=row;
				ch=(char) (64+row);
			}
			for(int j=1;j<=row;j++){
				if(i%2==1){
					System.out.print(num+""+ch+"\t");
					num++;
					ch++;
				}else{
					System.out.print(num+""+ch+"\t");
					num--;
					ch--;
				}
			}
			System.out.println();
		}
	}
}
