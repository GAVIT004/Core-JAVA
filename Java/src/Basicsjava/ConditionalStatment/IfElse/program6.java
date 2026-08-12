package Basicsjava.ConditionalStatment.IfElse;

import java.util.*;
class DivisibleBy3Or7{
        public static void main(String[]args){
                Scanner sc=new Scanner (System.in);
                int x=sc.nextInt();
                if(x%7==0||x%3==0){
                        System.out.println(x +"is Divisible By 7 Or 3");
                }else if(x%7!=0||x%3==0){
                        System.out.println(x +"is Not Divisible By 7 Or 3");
                }else{
                        System.out.println("Invalid Input");
                }
        }
}

