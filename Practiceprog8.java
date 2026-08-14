package Basicsjava;

import java.util.Scanner;

class BankAccount{
    String accHolderName;
    int accountNumber;
    double balance;

    BankAccount(String name,int num,double bal){
        accHolderName=name;
        accountNumber=num;
        balance=bal;
    }

    void displayaccountdetails(){
        System.out.println("----Account Detail----");
        System.out.println("Account holder name:  "+accHolderName);
        System.out.println("Account Number:  "+accountNumber);
        System.out.println("Account balance:  "+balance);
    }

    void deposite(double amount){
        balance=balance+amount;
        System.out.println("Amount deposite successfully:  "+amount);
    }

    void withdraw(double amount){
        if(balance>=amount){
            balance=balance-amount;
            System.out.println("Withdraw amount successfully: "+amount);
        }else {
            System.out.println("Insufficient balance: "+amount);
        }
    }

    void cheackBal(){
        System.out.println("Balance:  "+balance);
    }

}
public class Practiceprog8 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("----Enter a Bank Details----");
        System.out.println("Enter a account holder name:");
        String name=scanner.next();
        System.out.println("Enter a account number: ");
        int num=scanner.nextInt();
        System.out.println("Enter a balance: ");
        double bal=scanner.nextDouble();
        BankAccount bankAccount=new BankAccount(name,num,bal);
        bankAccount.displayaccountdetails();
        int choice;
        do {
            System.out.println("----Bank Menu----");
            System.out.println("1. Deposite a amount");
            System.out.println("2.Withdraw a amount");
            System.out.println("3.Cheal Balance");
            System.out.println("4.Exit...!");

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a deposite amount");
                    double dep = scanner.nextDouble();
                    bankAccount.deposite(dep);
                    break;
                case 2:
                    System.out.println("Enter a withdrwal amount:");
                    double withdraw = scanner.nextDouble();
                    bankAccount.withdraw(withdraw);
                    break;
                case 3:
                    bankAccount.cheackBal();
                    break;
                case 4:
                    System.out.println("Thank you for using Atm");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice!=4);

        scanner.close();

    }
}
