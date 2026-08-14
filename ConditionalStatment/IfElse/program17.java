package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class ProfitOrLoss{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int selling_price=sc.nextInt();
		int cost_price=sc.nextInt();
		
		if(selling_price > cost_price){
			System.out.println( selling_price-cost_price +"is Profit");
		}else if(selling_price < cost_price){
			System.out.println( cost_price-selling_price +"is loss");
		}else if (selling_price == cost_price){
			System.out.println("Not a profit and not a loss");
		}else{
			System.out.println("Bank is Corrpt");
		}
	}
}
