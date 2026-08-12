package Basicsjava.OOP.Inheritance.MultipleInheritance;

import java.util.Scanner;

interface Discount{
    default void calculateDiscount(){

    }
}

interface GST{
    default void calculateGST(){

    }
}

class ShoppingCart implements Discount,GST{
    String customerName;
    String productName;
    int quantity;
    double pricePerItem;

    void getShoppingCart(String customer,String product,int qun,double price){
        customerName=customer;
        productName=product;
        quantity=qun;
        pricePerItem=price;
    }

    void displayShoppingCart(){
        System.out.println("Customer name: "+customerName);
        System.out.println("Product name: "+productName);
        System.out.println("Product Quantity: "+quantity);
        System.out.println("Product price: "+pricePerItem);
    }

    double totalPrice;
    void totalPrice(){
        totalPrice=quantity*pricePerItem;
        System.out.println("Total price: "+totalPrice);
    }

    double discountPrice;
    @Override
    public void calculateDiscount(){
        discountPrice=(totalPrice*10)/100;
        System.out.println("Discount price: "+discountPrice);
    }

    double gst;
    @Override
    public void calculateGST(){
        gst=(discountPrice*18)/100;
        System.out.println("GST: "+gst);
    }

    void finalPrice(){
        double finalPrice=discountPrice+gst;
        System.out.println("Final price: "+finalPrice);
    }
}
public class Program4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a customer name: ");
        String name=scanner.nextLine();
        System.out.println("Enter a product name: ");
        String product=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter product quantity: ");
        int qun=scanner.nextInt();
        System.out.println("Enter a product price: ");
        double price=scanner.nextDouble();
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.getShoppingCart(name,product,qun,price);
        shoppingCart.displayShoppingCart();
        shoppingCart.totalPrice();
        shoppingCart.calculateDiscount();
        shoppingCart.calculateGST();
        shoppingCart.finalPrice();
        scanner.close();
    }
}
