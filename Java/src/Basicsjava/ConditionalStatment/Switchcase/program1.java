package Basicsjava.ConditionalStatment.Switchcase;

import java.io.*;
class TrafficLight{
	public static void main(String[]args) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter a Colour");
		String colour=br.readLine();
		switch(colour){
			case "RED":
				System.out.println("STOP");
				break;
			case "Red":
                                System.out.println("STOP");
				break;
			case "red":
                                System.out.println("STOP");
				break;
			case "YELLOW":
                                System.out.println("GO SLOW");
				break;
		        case "Yellow":
                                System.out.println("GO SLOW");
				break;
			case "yellow":
                                System.out.println("GO SLOW");
				break;
			case "GREEN":
                                System.out.println("GO");
				break;
			case "Green":
                                System.out.println("GO");
				break;
			case "green":
                                System.out.println("GO");
				break;
			default:
				System.out.print("No Such Colour is present in traffic lights");
		}

	}
}
