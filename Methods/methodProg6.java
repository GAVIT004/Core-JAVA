package Basicsjava.Methods;

import java.util.Scanner;

class BankAccount{
    String accountHolderName;
    int accountNumber;
    double accountbalance;

    void acceptBankDetail(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a bank account holder name: ");
        accountHolderName=scanner.next();
        System.out.println("Enter a account number: ");
        accountNumber=scanner.nextInt();
        System.out.println("Enter a account balance: ");
        accountbalance=scanner.nextDouble();
    }

    void displayBankDetail(){
        System.out.println("Account Holder name: "+accountHolderName);
        System.out.println("Account number: "+accountNumber);
        System.out.println("Account balance: "+accountbalance);
    }

    void checkBalance(){
        System.out.println("Account balance: "+accountbalance);
    }

    void deposite(double amount){
        accountbalance=accountbalance+amount;
    }
    double checkcurrentbalance(){
        return accountbalance;
    }

    double withdraw(double amount){

        if(accountbalance>=amount){
            accountbalance=accountbalance-amount;
            System.out.println("Amount withdraw succesfully: "+accountbalance);
        }else {
            System.out.println("Insufficient Balance!!!");
        }
        return accountbalance;
    }

}

public class methodProg6{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        BankAccount bank=new BankAccount();
        bank.acceptBankDetail();
        bank.displayBankDetail();
        bank.checkBalance();
        System.out.println("Enter a deposite amount:");
        double amount=sc.nextDouble();
        bank.deposite(amount);
        System.out.println("Current balance:"+bank.checkcurrentbalance());
        System.out.println("Enter a withdrawal  amount:");
        double  withdraamount=sc.nextDouble();
        bank.withdraw(withdraamount);


    }

}
