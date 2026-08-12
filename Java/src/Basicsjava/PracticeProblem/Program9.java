package Basicsjava.PracticeProblem;

import java.util.Scanner;

class Product{
    String productName;
    double productPrice;
    int productQuantity;
    double totalBill;
    double finalPrice;

    void getProduct(String name,double price,int quantity){
        productName=name;
        productPrice=price;
        productQuantity=quantity;
    }

    void calculateTotalBill(){
        totalBill=productPrice*productQuantity;
        System.out.println("Total Bill: "+totalBill);
    }

    void discount(){
        if(totalBill>=10000){
            System.out.println("Free Delivery");
            finalPrice=totalBill;
        }else {
            System.out.println("Delivery charges: 100");
            finalPrice=totalBill+100;
        }

        System.out.println("Final price: "+finalPrice);
    }
}

class Electronics extends Product{
    String electronicsBrand;
    int electronicsWarranty;

    void getElectronics(String brand,int warranty){
        electronicsBrand=brand;
        electronicsWarranty=warranty;
    }

    void displayElectronics(){
        System.out.println("Product name: "+productName);
        System.out.println("Product brand: "+electronicsBrand);
        System.out.println("Product warranty: "+electronicsWarranty);
        System.out.println("Product price: "+productPrice);
        System.out.println("Product quantity: "+productQuantity);
    }
}

class Cloths extends Product{
    String clothsSize;
    String clothsColor;

    void getCloths(String size,String color){
        clothsSize=size;
        clothsColor=color;
    }

    void displayCloths(){
        System.out.println("Product name: "+productName);
        System.out.println("Product size: "+clothsSize);
        System.out.println("Product color: "+clothsColor);
        System.out.println("Product price: "+productPrice);
        System.out.println("Product quantity: "+productQuantity);
    }
}
public class Program9 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int choice;
        do {
            System.out.println("Which product you what to buy?");

            System.out.println("1. Electronics");
            System.out.println("2. Cloths");
            System.out.println("3. Exit");

            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a product name: ");
                    String name = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Enter a product brand: ");
                    String brand=scanner.nextLine();

                    System.out.println("Enter a product warranty: ");
                    int warranty=scanner.nextInt();

                    scanner.nextLine();

                    System.out.println("Enter a product price: ");
                    double price = scanner.nextDouble();

                    System.out.println("Enter a product quantity: ");
                    int quantity = scanner.nextInt();

                    scanner.nextLine();

                    Electronics electronics=new Electronics();
                    electronics.getProduct(name,price,quantity);
                    electronics.getElectronics(brand,warranty);
                    electronics.displayElectronics();
                    electronics.calculateTotalBill();
                    electronics.discount();
                    break;
                case 2:
                    System.out.println("Enter a product name: ");
                    String clothName = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Enter a product size: ");
                    String size=scanner.nextLine();

                    System.out.println("Enter a product color: ");
                    String color=scanner.next();

                    scanner.nextLine();

                    System.out.println("Enter a product price: ");
                    double clothPrice = scanner.nextDouble();

                    System.out.println("Enter a product quantity: ");
                    int clothQuantity = scanner.nextInt();

                    scanner.nextLine();

                    Cloths cloths=new Cloths();
                    cloths.getProduct(clothName,clothPrice,clothQuantity);
                    cloths.getCloths(size,color);
                    cloths.displayCloths();
                    cloths.calculateTotalBill();
                    cloths.discount();
                    break;
                case 3:
                    System.out.println("Thank you for visit");
                    break;
                default:
                    System.out.println("Please ent valid choice");
            }
        }while (choice!=3);

        scanner.close();
    }
}
