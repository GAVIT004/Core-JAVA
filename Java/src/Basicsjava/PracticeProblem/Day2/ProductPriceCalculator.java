package Basicsjava.PracticeProblem.Day2;

import java.util.Scanner;

class SmallRetailShop{

    String productName;
    double productPrice;
    int quantity;
    double discountPercentage;
    double GSTPercentage;

    public SmallRetailShop(String productName, double productPrice, int quantity, double discountPercentage, double GSTPercentage) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.discountPercentage = discountPercentage;
        this.GSTPercentage = GSTPercentage;
    }

    double subTotal(){
        return productPrice*quantity;
    }

    double discountAmount(){
        return subTotal()*discountPercentage/100;
    }

    double priceAfterDiscount(){
        return subTotal()-discountAmount();
    }

    double GSTAmount(){
        return priceAfterDiscount()*GSTPercentage/100;
    }

    double finalAmount(){
        return priceAfterDiscount()+GSTAmount();
    }

}

public class ProductPriceCalculator {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Product Name: ");
        String productName=scanner.next();
        System.out.println("Price: ");
        double price=scanner.nextDouble();
        System.out.println("Quantity: ");
        int quantity=scanner.nextInt();
        System.out.println("Discount: ");
        double discount=scanner.nextDouble();
        System.out.println("GST: ");
        double GST=scanner.nextDouble();

        SmallRetailShop smallRetailShop=new SmallRetailShop(productName,price,quantity,discount,GST);

        System.out.println("============BILL=========");
        System.out.println();
        System.out.println("Product Name: "+smallRetailShop.productName);
        System.out.println("Unit Price: "+smallRetailShop.productPrice);
        System.out.println("Quantity: "+smallRetailShop.quantity);
        System.out.println("Subtotal: "+smallRetailShop.subTotal());
        System.out.println();
        System.out.println("Discount("+smallRetailShop.discountPercentage+"):"+smallRetailShop.discountAmount());
        System.out.println("After Discount: "+smallRetailShop.priceAfterDiscount());
        System.out.println();
        System.out.println("GST:("+smallRetailShop.GSTPercentage+"):"+smallRetailShop.GSTAmount());
        System.out.println();
        System.out.println("Final Amount: "+smallRetailShop.finalAmount());
    }
}
