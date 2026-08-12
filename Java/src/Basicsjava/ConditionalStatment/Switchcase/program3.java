package Basicsjava.ConditionalStatment.Switchcase;

import java.io.*;
class ClothSize{
	public static void main(String[]args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter a size code:");
		String size=br.readLine();
		switch(size){
			case "S":
				System.out.println(size+ ":Your Size is Small");
				break;
			case "s":
                                System.out.println(size+ ":Your Size is Small");
                                break;
			case "M":
                                System.out.println(size+ ":Your Size is Medium");
                                break;
			case "m":
                                System.out.println(size+ ":Your Size is Medium");
                                break;
			case "L":
                                System.out.println(size+ ":Your Size is Large");
                                break;
		        case "l":
                                System.out.println(size+ ":Your Size is Large");
                                break;
		        case "XL":
                                System.out.println(size+ ":Your Size is Extra Large");
                                break;
		        case "xl":
                                System.out.println(size+ ":Your Size is Extra Large");
                                break;
		        default:
				System.out.println("Such size code is not found");
		         		
		}
		

	}
}
