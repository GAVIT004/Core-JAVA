package Basicsjava.ConditionalStatment.Switchcase;

import java.io.*;
class Calculator{
	public static void main(String[]args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter num1:");
		float num1=Float.parseFloat(br.readLine());
		System.out.println("Enter a Opration");
		char opration=br.readLine().charAt(0);
		System.out.println("Enter num2:");
		float num2=Float.parseFloat(br.readLine());
		double result;
		switch(opration){
			case '+':result=num1+num2;
				 System.out.println("Addition is:"+result);
				 break;
			case '-':result=num1-num2;
                                 System.out.println("Subtraction is:"+result);
                                 break;
			case '*':result=num1*num2;
                                 System.out.println("Multipication is:"+result);
                                 break;
			case '/':result=num1/num2;
                                 System.out.println("Division is:"+result);
                                 break;
			default:
				 System.out.println("Invalid Oprator");
		}
	}
}
