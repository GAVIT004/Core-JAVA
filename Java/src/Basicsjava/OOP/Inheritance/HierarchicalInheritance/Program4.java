package Basicsjava.OOP.Inheritance.HierarchicalInheritance;

import java.util.Scanner;

class Product{
    String productName;
    int productPrice;


    void getProduct(String name,int price){
        productName=name;
        productPrice=price;
    }
    void displayProduct(){
        System.out.println("Product Name: "+productName);
        System.out.println("Product Price: "+productPrice);
    }
}

class Electonics extends Product{
    int warrrenty;
    int gst=18;

    void getWarrenty(int warrentyTime){
        warrrenty=warrentyTime;
    }
    void calculateElectronics(){
        double gstPrice=productPrice*gst/100;
        double finalPrice=productPrice+gstPrice;
        System.out.println("Final Price: "+finalPrice);
    }

    void displayElectronics(){
        System.out.println("Product Warrenty: "+warrrenty);
        System.out.println("GST "+gst+"%");
    }
}

class Clothing extends Product{
    String size;
    int discount;

    void getClothing(String s,int d){
        size=s;
        discount=d;
    }

    void displayClothing(){
        System.out.println("Size: "+size);
        System.out.println("Discount: "+discount+"%");
    }

    void calculateDiscount(){
        double discountAmount=(productPrice*discount)/100;
        double discountPrice=productPrice-discountAmount;
        System.out.println("Price: "+discountPrice);
    }
}

class Grocery extends Product{
    int quantity;
    int perKgPrice;

    void getGrocery(int qlty,int price){
        quantity=qlty;
        perKgPrice=price;
    }

    void displayGrocery(){
        System.out.println("Quantity: "+quantity);
        System.out.println("Price per KG: "+perKgPrice);
    }

    void totalBill(){
        double totalBill=quantity*perKgPrice;
        System.out.println("Total Bill: "+totalBill);
    }
}
public class Program4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a product name: ");
        String name=scanner.nextLine();
        System.out.print("Enter a product price: ");
        int price=scanner.nextInt();
        System.out.print("Enter a product type: ");
        String type=scanner.next();
        switch (type){
            case "Electronics":
                Electonics electonics=new Electonics();
                electonics.getProduct(name,price);
                System.out.print("Enter a warrenty period: ");
                int num=scanner.nextInt();
                electonics.getWarrenty(num);
                electonics.displayProduct();
                electonics.displayElectronics();
                electonics.calculateElectronics();
                break;
            case "Clothing" :
                Clothing clothing=new Clothing();
                clothing.getProduct(name,price);
                System.out.print("Enter a size: ");
                String size=scanner.next();
                System.out.print("Enter a discount");
                int discount=scanner.nextInt();
                clothing.getClothing(size,discount);
                clothing.displayClothing();
                clothing.calculateDiscount();
                break;
            case "Grocery":
                Grocery grocery=new Grocery();
                grocery.getProduct(name,price);
                grocery.displayProduct();
                System.out.print("Enter a Quantity: ");
                int quaty=scanner.nextInt();
                System.out.print("Enter a per kg price: ");
                int perPrice=scanner.nextInt();
                grocery.getGrocery(quaty,perPrice);
                grocery.displayGrocery();
                grocery.totalBill();
                break;
            default:
                System.out.println("Invalid Product");
        }
        scanner.close();
    }
}
