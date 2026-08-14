package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class Week{
        public static void main(String[]args){
                Scanner sc=new Scanner (System.in);
                int x=sc.nextInt();
                if(x==1){
			System.out.println("Monday");
		}else if(x==2){
			 System.out.println("Tuesday");
                }else if(x==3){
			 System.out.println("Wensday");
                }else if(x==4){
			 System.out.println("Thusday");
                }else if(x==5){
			 System.out.println("Friday");
                }else if(x==6){
			 System.out.println("Satday");
                }else if(x==7){
			 System.out.println("Sunday");
                }else{
			System.out.println("Invalid Input");
		}
	}
}
