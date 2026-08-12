package Basicsjava.PracticeProblem;

import java.util.Scanner;

class Customer{
    String customerName;
    String[] productName;
    int numberOfProducts;
    double[] productPrice;
    double totalBill;
    double discountBill;
    double finalBill;

    void getCustomer(String customer,int noOfProducts){
        customerName=customer;
        productName=new String[noOfProducts];
        productPrice=new double[noOfProducts];
    }

    void addItems(Scanner scanner){
       for (int i=0;i<productName.length;i++){
           System.out.println("\n Product "+(i+1));

           System.out.print("Enter a product name:");
           productName[i]=scanner.nextLine();

          // scanner.nextLine();
           System.out.print("Enter a product price: ");
           productPrice[i]=scanner.nextDouble();

           scanner.nextLine();
       }
    }

    void calculateBill(){
        for (int i=0;i<productPrice.length;i++){
            totalBill +=productPrice[i];
        }

        if(totalBill>=5000){
            discountBill=totalBill*20/100;
        } else if (totalBill>=3000) {
            discountBill=totalBill*10/100;
        }else {
            discountBill=0;
        }

        finalBill=totalBill-discountBill;
    }

    void printReceipt(){
        System.out.println("#===Product Receipt===#");
        System.out.println("Customer Name: "+customerName);
        for (int i=0;i<productName.length;i++){
            System.out.println((i+1)+" ."+productName[i]+" -$"+productPrice[i]);
        }

        System.out.println("Total Bill: "+totalBill);
        System.out.println("Discount: "+discountBill);
        System.out.println("Final Bill: "+finalBill);
    }
}
public class Program6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name=scanner.nextLine();

        System.out.print("Enter a number of products");
        int num=scanner.nextInt();

        Customer customer=new Customer();
        customer.getCustomer(name,num);
        customer.addItems(scanner);
        customer.calculateBill();
        customer.printReceipt();

        scanner.close();
    }
}
