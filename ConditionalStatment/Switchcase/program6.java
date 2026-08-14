package Basicsjava.ConditionalStatment.Switchcase;

import java.util.*;
class NumSpelling{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		switch(num){
			case 1:
				{
					System.out.println(num+" : One");
					break;
				}
			case 2:
				{
					System.out.println(num+" : Two");
					break;
				}
			case 3:
				{
					System.out.println(num+" : Three");
					break;
				}
			case 4:
				{
					System.out.println(num+" : Four");
					break;
				}
			case 5:
				{
					System.out.println(num+" : Five");
					break;
				}
			default:
				{
					System.out.println(num+" is Greater Than Five");
				}
		}
	}
}
