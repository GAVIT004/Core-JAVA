package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class Months{
        public static void main(String[]args){
                Scanner sc=new Scanner (System.in);
                int x=sc.nextInt();
                if(x==1){
                        System.out.println("JAN");
                }else if(x==2){
                         System.out.println("FEB");
                }else if(x==3){
                         System.out.println("MARCH");
                }else if(x==4){
                         System.out.println("APRIL");
                }else if(x==5){
                         System.out.println("MAY");
                }else if(x==6){
                         System.out.println("JUN");
                }else if(x==7){
                         System.out.println("JUL");
                }else if(x==8){
                        System.out.println("AUG");
		}else if(x==9){                                                                                                                                                     System.out.println("Sep");
		}else if(x==10){                                                                                                                                                     System.out.println("OCT");
	       	}else if(x==11){                                                                                                                                                     System.out.println("NOV");
	       	}else if(x==12){                                                                                                                                                     System.out.println("DEC");
	       	}else{
			System.out.println("Invalid Input");
		}
	}
}
