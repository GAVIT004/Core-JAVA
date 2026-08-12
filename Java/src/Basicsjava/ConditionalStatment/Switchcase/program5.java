package Basicsjava.ConditionalStatment.Switchcase;

import java.io.*;
class Months{
        public static void main(String[]args)throws IOException{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            System.out.println("Enter a num;");
		    int num=Integer.parseInt(br.readLine());
		    switch(num){
			    case 1:
				    System.out.println(num+":Jan");
				    break;
			    case 2:
                    System.out.println(num+":Feb");
                    break;
			    case 3:
                    System.out.println(num+":Mar");
                    break;
			    case 4:
                    System.out.println(num+":Apr");
                    break;
			    case 5:
                    System.out.println(num+":May");
                    break;
			    case 6:
                    System.out.println(num+":June");
                    break;
			    case 7:
                    System.out.println(num+":July");
                    break;
			    case 8:
                    System.out.println(num+":Aug");
                    break;
			    case 9:
                    System.out.println(num+":Sep");
                    break;
			    case 10:
                    System.out.println(num+":Oct");
                    break;
			    case 11:
                    System.out.println(num+":Nov");
                    break;
			    case 12:
                    System.out.println(num+":Dec");
                    break;
		    	default:
			    	System.out.println("Invalid num:");
		}
	}
}

