package Basicsjava.ConditionalStatment.Switchcase;

import java.io.*;
class Grades{
	public static void main(String[]args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter a your Grades");
		char grade=br.readLine().charAt(0);
		switch(grade){
			case 'O':
				System.out.println(grade+":  Oustanding");
				break;
			case 'o':
                                System.out.println(grade+":OutStanding");
                                break;
			case 'A':
                                System.out.println(grade+":Excellent");
                                break;
			case 'a':
                                System.out.println(grade+":Excellent");
                                break;
			case 'B':
                                System.out.println(grade+":Better");
                                break;
			case 'b':
                                System.out.println(grade+":Better");
                                break;
			case 'C':
                                System.out.println(grade+":Good");
                                break;
			case 'c':
                                System.out.println(grade+":Good");
                                break;
			case 'P':
                                System.out.println(grade+":Passed");
                                break;
			case 'p':
                                System.out.println(grade+":Passed");
                                break;
			case 'F':
                                System.out.println(grade+":Failed");
                                break;
			case 'f':
                                System.out.println(grade+":Failed");
                                break;
			default:
				System.out.println("Such a kind Grade not fount!!!");
		}
	}
}

