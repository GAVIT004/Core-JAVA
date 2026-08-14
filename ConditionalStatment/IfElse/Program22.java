package Basicsjava.ConditionalStatment.IfElse;

import java.util.Scanner;

public class Program22 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a who while drive(Aditya/Ashutosh)");
        String driver=scanner.next();
        boolean planIsOn=true;
        if(driver.equalsIgnoreCase("Aditya")||driver.equalsIgnoreCase("Ashutosh")){
            if(planIsOn){
                System.out.println("We going to teacking to Lohagad....");
                System.out.println("Which gone take there bike!!!!");
                if(driver.equalsIgnoreCase("Aditya") ){
                    System.out.println("Aditya take his bike and drive also So...");
                    System.out.println("Petrol paid by Ashutosh...");
                } else if (driver.equalsIgnoreCase("Ashutosh")) {
                    System.out.println("Aditya take his bike and Ashutosh will drive So...");
                    System.out.println("Petrol expence will paid both 50-50 ");
                }else {
                    System.out.println("Plan is cnacel due to some reasons!!!!");
                }
            }
        }else {
            System.out.println("Invalid Driver!!!!");
        }
        scanner.close();
    }
}



