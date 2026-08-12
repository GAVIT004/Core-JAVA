package Basicsjava.OOP.Inheritance.HybridInheritance;

import java.util.Scanner;

class Product{
    String productName;
    double productPrice;

    void getProduct(String product,double price){
        productName=product;
        productPrice=price;
    }

    void displayProduct(){
        System.out.println("Product name: "+productName);
        System.out.println("Product price: "+productPrice);
    }
}

interface Discount{
    default void calculateDiscount(){

    }
}

interface GST{
    default void calculateGST(){

    }
}

class ShoppingCart extends Product implements Discount,GST{
    String customerName;
    int quantity;

    void getShoppingCart(String customer,int qunty){
        customerName=customer;
        quantity=qunty;
    }

    void displayShoppingCart(){
        System.out.println("Customer name: "+customerName);
        System.out.println("Quantity: "+quantity);
    }

    double totalPrice;
    void totalPrice(){
        totalPrice=quantity*productPrice;
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

public class Program3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a product name: ");
        String product=scanner.next();
        System.out.println("Enter a product price: ");
        double price=scanner.nextDouble();
        System.out.println("Enter a customer name: ");
        String customer=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter a product quantity: ");
        int qunatity=scanner.nextInt();
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.getProduct(product,price);
        shoppingCart.getShoppingCart(customer,qunatity);
        shoppingCart.displayProduct();
        shoppingCart.displayShoppingCart();
        shoppingCart.totalPrice();
        shoppingCart.calculateDiscount();
        shoppingCart.calculateGST();
        shoppingCart.finalPrice();
        scanner.close();
    }
}
