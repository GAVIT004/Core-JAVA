package Basicsjava.OOP.Inheritance.MultipleInheritance;

import java.util.Scanner;

interface UPIPayment{
    default void payUsingUPI(double amount){
        System.out.println("payment successful by UPI: "+amount);
    }
}

interface CardPayment{
    default void payUsingCard(double amount){
        System.out.println("Payment successful by card: "+amount);
    }
}

class PaymentGatWay implements UPIPayment,CardPayment{
    String customerName;
    String bankName;
    double amount;

    void getPaymentGatway(String customer,String bank,double price){
        customerName=customer;
        bankName=bank;
        amount=price;
    }

    void displayTransaction(){
        System.out.println("Customer name: "+customerName);
        System.out.println("Bank Name: "+bankName);
        UPIPayment.super.payUsingUPI(amount);
        CardPayment.super.payUsingCard(amount);
    }
}
public class Program3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a customer name: ");
        String customer=scanner.nextLine();
        System.out.println("Enter a bank name: ");
        String bank=scanner.nextLine();
        System.out.println("Enter a amount: ");
        double price=scanner.nextDouble();
        PaymentGatWay paymentGatWay=new PaymentGatWay();
        paymentGatWay.getPaymentGatway(customer,bank,price);
        paymentGatWay.displayTransaction();
    }
}
