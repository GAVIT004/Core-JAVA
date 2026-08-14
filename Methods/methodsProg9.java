package Basicsjava.Methods;

import java.util.Scanner;

class laptops{
    String brand;
    String processor;
    double price;

    void displaylap(){
        System.out.println("Laptop brand: "+brand);
        System.out.println("Laptop processor: "+processor);
        System.out.println("Laptop price: "+price);
    }

    void chagePrice(double newPrice){
        price=newPrice;
    }

    double getPrice(){
        return price;
    }

    double discountPrice(double discount){
        if(price<50000){
            System.out.println("No discount!!!");
            return price;
        }
        double disPrice=(price*discount)/100;
        return price-disPrice;
    }

}

public class methodsProg9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        laptops lap=new laptops();
        System.out.println("Enter laptop name:");
        lap.brand=sc.next();
        System.out.println("Enter laptop processor:");
        lap.processor=sc.next();
        System.out.println("Enter laptop price:");
        lap.price=sc.nextDouble();
        lap.displaylap();
        System.out.println("Enter laptop new price:");
        double newPrice= sc.nextDouble();
        lap.chagePrice(newPrice);
        System.out.println("New price of laptop: "+lap.getPrice());
        System.out.println("Enter a discount:");
        double dis=sc.nextDouble();
        System.out.println("New discounted price:"+lap.discountPrice(dis));
    }
}
