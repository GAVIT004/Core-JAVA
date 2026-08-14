package Basicsjava;

import java.util.Scanner;

class Product{
    String productName;
    double productPrice;
    int productQuantity;

    Product(String name, double price,int quanntity){
        productName=name;
        productPrice=price;
        productQuantity=quanntity;


    }

    void displayProduct(){
        System.out.println("Product Name: "+productName);
        System.out.println("Product Price: "+productPrice);
        System.out.println("Product Quantity: "+productQuantity);


    }

    double countBill(){
        double totalBill;
       totalBill=  productQuantity*productPrice;
        System.out.println("Total bill:"+totalBill);
       return totalBill;

    }



}

public class practiceprog4 {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total products");
        int noproduct= sc.nextInt();
        Product[] products=new Product[noproduct];
        for(int i=0;i<noproduct;i++){
            System.out.println("Enter a product "+(i+1));
            System.out.println("Enter a product name:");
            String name=sc.next();
            System.out.println("Enter a product price:");
            double price= sc.nextDouble();
            System.out.println("Enter a product quantity");
            int quantity=sc.nextInt();
            products[i]= new Product(name,price,quantity);
        }

        System.out.println("Enter a product detail");
        for(int i =0;i<noproduct;i++){
            products[i].displayProduct();
            products[i].countBill();
        }

    }
}
