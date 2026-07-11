package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class DivisibleBy2510{
        public static void main(String[]args){
                Scanner sc=new Scanner (System.in);
                int x=sc.nextInt();
                if(x%2==0 && x%5==0 && x%10==0){
                        System.out.println(x +"is Divisible By 2,5 and 10");
                }else if(x%2!=0 && x%5!=0 && x%10!=0){
                        System.out.println(x +"is Not Divisible By 2,5 and 10");
                }else{
                        System.out.println("Invalid Input");
                }
        }
}
