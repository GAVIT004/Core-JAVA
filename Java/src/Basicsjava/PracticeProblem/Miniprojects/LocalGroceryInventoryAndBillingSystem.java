package Basicsjava.PracticeProblem.Miniprojects;

import java.util.Scanner;

class Product{
    int []productId;
    String[] productName;
    double[] productPrice;
    int[] productQuantity;
    int inventorySize;

    void getProduct(int size){
        inventorySize=size;
        productId=new int[size];
        productName=new String[size];
        productPrice=new double[size];
        productQuantity=new int[size];
    }

    void addProduct(Scanner scanner){
        System.out.print("Insert Inventory Data");

        boolean added=false;
        for (int i=0;i< productId.length;i++){
            if(productId[i]==0) {
                System.out.println("Enter a product " + (i + 1) + " id:");
                productId[i] = scanner.nextInt();

                scanner.nextLine();

                System.out.println("Enter a product " + (i + 1) + " name:");
                productName[i] = scanner.nextLine();

                System.out.println("Enter a product " + (i + 1) + " price:");
                productPrice[i] = scanner.nextDouble();

                System.out.println("Enter a product " + (i + 1) + " quantity:");
                productQuantity[i] = scanner.nextInt();

                scanner.nextLine();

                System.out.println("Product added successfully");
                added=true;
                break;
            }

            if(!added){
                System.out.println("Inventory is full!");
            }

        }
    }

    void displayProduct(){
        System.out.println("Product Inventory");

        boolean Empty=true;

        for (int i=0;i< productId.length;i++){
            System.out.println("product ID: "+productId[i]+
                    " Product Name: "+productName[i]+
                    " Product Price: "+productPrice[i]+
                    " Product Quantity: "+productQuantity[i]
            );

            Empty=false;
        }

        if(Empty){
            System.out.println("Inventory is empty");
        }
    }
}

class Inventory extends Product{
    int buyId;
    int buyQuantity;
    double totalPrice;
    double discount;
    double finalBill;
    int upId;

    void purchaseProduct(Scanner scanner) {
        System.out.println("Enter a product id to buy:");
        buyId = scanner.nextInt();

        System.out.println("Enter product quantity to buy:");
        buyQuantity = scanner.nextInt();

        boolean found = false;

        for (int j = 0; j < productId.length; j++) {

            if (productId[j] == buyId ) {
                found = true;

                if (productQuantity[j]>=buyQuantity) {
                    totalPrice = productPrice[j] * buyQuantity;
                    productQuantity[j] = productQuantity[j] - buyQuantity;

                    if (totalPrice >= 5000) {
                        discount = totalPrice * 100 / 20;
                        finalBill = totalPrice - discount;
                        System.out.println("Discount: "+discount);
                    } else if (totalPrice >= 3000) {
                        System.out.println("Free Delivery");
                        finalBill = totalPrice;
                        System.out.println("Final Bill: " + finalBill);
                    }

                    System.out.println("//===Bill===//");
                    System.out.println("Product Name: "+productName[j]);
                    System.out.println("Product Quantity: "+buyQuantity);
                    System.out.println("Total Bill: "+totalPrice);
                    System.out.println("Discount: "+discount);
                    System.out.println("Final Bill: " + finalBill);

                }else {
                    System.out.println("Insufficient Stock");
                }
                break;
            }

            if (!found){
                System.out.println("Product not fount");
            }
        }
    }

    void updateStock(Scanner scanner){
        System.out.println("Enter product to update stock:");
        upId=scanner.nextInt();

        boolean found=false;

        for (int j=0;j<productId.length;j++){
            if(productId[j]==upId){
                System.out.println("Enter a new stock: ");
                productQuantity[j]=scanner.nextInt();
                System.out.println("Stock update successfully ");

                found=true;
                break;
            }
        }

        if (!found){
            System.out.println("Product not fount");
        }
    }

    void displayStock(){
        boolean empty=true;
        for (int i=0;i<productId.length;i++){
            System.out.println("Product Id: "+productId[i]+" Stock: "+productQuantity[i]);
            empty=false;
            break;
        }

        if(true){
            System.out.println("Inventory is empty!");
        }
    }
}
public class LocalGroceryInventoryAndBillingSystem {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Inventory size:");
        int size=scanner.nextInt();

        Inventory inventory=new Inventory();
        inventory.getProduct(size);

        int choice;
        do {
            System.out.println("1. Add products inventory");
            System.out.println("2. Display Inventory");
            System.out.println("3. Purchase Product");
            System.out.println("4. Update stock");
            System.out.println("5. Display stock");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();

            switch (choice){
                case 1:
                    inventory.addProduct(scanner);
                    break;
                case 2:
                    inventory.displayProduct();
                    break;
                case 3:
                    inventory.purchaseProduct(scanner);
                    break;
                case 4:
                    inventory.updateStock(scanner);
                case 5:
                    inventory.displayStock();
                    break;
                case 6:
                    System.out.println("Thank you for visit");
                    break;
                default:
                    System.out.println("Please enter valid choice");
            }
        }while (choice!=6);

        scanner.close();
    }
}
