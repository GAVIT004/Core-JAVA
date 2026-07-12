package Basicsjava.ConditionalStatment.Switchcase;

import java.util.*;
class Plans{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Plan");
		String plan=sc.next();
		switch(plan){
			case "Platinum":
				System.out.println("For the Platinum plan,the price is 799");
				break;
			case "Gold":
                                System.out.println("For the Gold plan,the price is 599");
                                break;
			case "Silver":
                                System.out.println("For the Silver plan,the price is 399");
                                break;
			case "Bronze":
                                System.out.println("For the Bronze plan,the price is 199");
                                break;
			case "Free":
                                System.out.println("For the Free plan,the price is less than 799");
                                break;
			default:
				System.out.println(" Invalid Plan");
		}
	}
}
