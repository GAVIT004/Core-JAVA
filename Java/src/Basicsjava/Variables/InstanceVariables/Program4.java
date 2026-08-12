package Basicsjava.Variables.InstanceVariables;

import java.util.Scanner;

class Laptop{
    String laptopbrand;
    String laptopProcessor;
    int laptopRam;
    double laptopPrice;

    void getLaptop(String brand,String processor,int ram,double price){
        laptopbrand=brand;
        laptopProcessor=processor;
        laptopRam=ram;
        laptopPrice=price;
    }

    void display(){
        System.out.println("Laptop brand: "+laptopbrand);
        System.out.println("Laptop processor: "+laptopProcessor);
        System.out.println("Laptop Ram: "+laptopRam+" GB");
        System.out.println("Laptop price: "+laptopPrice);
    }
}
public class Program4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a laptop inventory size:");
        int inventoryLaptop=scanner.nextInt();
        scanner.nextLine();

        String brand;
        String processor;
        int ram;
        double price;
        double expensive=0;
        double cheap=Double.MAX_VALUE;

        for (int i=0;i<inventoryLaptop;i++){
            System.out.println("Enter a laptop brand: ");
            brand=scanner.nextLine();
            System.out.println("Enter a laptop processor: ");
            processor=scanner.nextLine();
            System.out.println("Enter a laptop ram: ");
            ram=scanner.nextInt();
            System.out.println("Enter a laptop price");
            price=scanner.nextDouble();
            scanner.nextLine();
            Laptop laptop=new Laptop();
            laptop.getLaptop(brand,processor,ram,price);
            laptop.display();

            if(laptop.laptopPrice>laptop.laptopPrice){
              expensive=laptop.laptopPrice;
            }
            if (laptop.laptopPrice<laptop.laptopPrice){
                cheap=laptop.laptopPrice;
            }
        }

        System.out.println("=== Inventory Summary ===");
        if (inventoryLaptop > 0) {
            System.out.println("Most Expensive Laptop Price: " + expensive);
            System.out.println("Cheapest Laptop Price: " + cheap);
        } else {
            System.out.println("Inventory is empty.");
        }

        scanner.close();

    }
}
