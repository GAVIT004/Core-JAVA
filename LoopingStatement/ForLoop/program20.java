package Basicsjava.LoopingStatement.ForLoop;

import java.util.*;
class PatternNum{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a row:");
                int row=sc.nextInt();
                for(int i=1;i<=row;i++){
                        char ch=65;
                        for(int j=1;j<=row;j++){
                                System.out.print(ch+"\t");
                                ch++;
                        }
                        System.out.println();
                }
        }
}
