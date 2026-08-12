package Basicsjava.PracticeProblem;

import java.util.Scanner;

class ElectricityBill{

    void calculateBill(double units){
        if(units>0&&units<=100){
            System.out.println(units+" per unit cost is 5 rupees");
            double bill=units*5;
            System.out.println("Total ElectricityBill: "+bill);
        } else if (units>=101&&units<=200) {
            System.out.println(units+" per unit cost is 7 rupees");
            double bill=units*7;
            System.out.println("Total ElectricityBill: "+bill);
        } else{
            System.out.println(units+" per unit cost is 10 rupees");
            double bill=units*10;
            System.out.println("Total ElectricityBill: "+bill);
            
        }
    }
}

public class Program3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a units: ");
        double unit=scanner.nextDouble();
        ElectricityBill electricityBill=new ElectricityBill();
        electricityBill.calculateBill(unit);
        scanner.close();

    }
}
