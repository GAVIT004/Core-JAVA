package Basicsjava.ConditionalStatment.Switchcase;

import java.util.*;
class Movies{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a Year:");
                int movieYear=sc.nextInt();
		int year=0;
		if(movieYear>=2020 && movieYear<=2024){
			year=movieYear;
		}else{
			System.out.println("Data is Not Found");
		}
		switch(year){
			case 2020:{
					  System.out.println("Nomadland");
					  break;
			}
			case 2021:{
                                          System.out.println("CODA");
                                          break;
                        }
			case 2022:{
                                          System.out.println("Everything Everywhere All at Once");
                                          break;
                        }
			case 2023:{
                                          System.out.println("Oppenheimer");
                                          break;
                        }
			case 2024:{
                                          System.out.println("Anora");
                                          break;
                        }
		}
	}
}
