package Basicsjava.Methods;

import java.util.Scanner;

class Product{
    String productName;
    double price;
    int quantity;

    void displayProductDetail(){
        System.out.println("Product Name:"+productName);
        System.out.println("Product price:"+price);
        System.out.println("Product quantity"+quantity);
    }

    void updateQuantity(int qty){

        quantity=qty;
    }

    double totalBill(){
        return price*quantity;
    }

    double applyadiscount(double percentage){

        if(price<1000){
            System.out.println("No disccount");
            return price;
        }
        double discount=(price*percentage)/100;
        return price-discount;
    }



}

public class methodProg7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        Product product=new Product();
        System.out.println("Enter a product name: ");
        product.productName=sc.next();
        System.out.println("Enter a product price: ");
        product.price=sc.nextDouble();
        System.out.println("Enter a product quantity: ");
        product.quantity=sc.nextInt();
        product.displayProductDetail();
        System.out.println("Enter a new Quantity: ");
        int qty=sc.nextInt();
        product.updateQuantity(qty);
        System.out.println("Total Bill:  "+product.totalBill());
        System.out.println("Enter a discount percentage: ");
        int per= sc.nextInt();
        System.out.println("Price after discount: "+product.applyadiscount(per));



    }
}
