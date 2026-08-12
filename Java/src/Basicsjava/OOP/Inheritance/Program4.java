package Basicsjava.OOP.Inheritance;

import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private double balance;



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

     void calculateInterest(){
        System.out.println("Account Interest :");

    }


}

class SavingAccount extends BankAccount{
    @Override
    void calculateInterest(){
        System.out.println("Saving Account Interest = 6%");
        double interestBalance=getBalance()*6/100;
        System.out.println("Total interest : "+ interestBalance);
        double currentBalance=getBalance()+interestBalance;
        System.out.println("Curretnt balance: "+currentBalance);

    }
}
class currentAccount extends BankAccount{
    @Override
    void calculateInterest(){
        System.out.println("Current  Account Interest = 3%");
        double interestBalance=getBalance()*3/100;
        System.out.println("Total interest : "+ interestBalance);
        double currentBalance=getBalance()+interestBalance;
        System.out.println("Curretnt balance: "+currentBalance);

    }
}



public class Program4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        System.out.println("Enter a account number:");
        int accountNum=scanner.nextInt();
        System.out.println("Enter your account balance: ");
        double balance=scanner.nextDouble();
        bankAccount.calculateInterest();
        bankAccount=new SavingAccount();
        bankAccount.setAccountNumber(accountNum);
        bankAccount.setBalance(balance);
        bankAccount.calculateInterest();
        bankAccount=new currentAccount();
        bankAccount.setAccountNumber(accountNum);
        bankAccount.setBalance(balance);
        bankAccount.calculateInterest();

    }
}






