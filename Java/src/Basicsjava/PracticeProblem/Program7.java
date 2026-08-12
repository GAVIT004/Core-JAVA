package Basicsjava.PracticeProblem;

import java.util.Scanner;

class BankAccount{
    String customerName;
    long accountNumber;
    double balance;
    double depositAmount;
    double withdrawAmount;

    void getAccount(String name,long accNum,double bal){
        customerName=name;
        accountNumber=accNum;
        balance=bal;
    }

    void deposit(Scanner scanner){
        System.out.println("Enter a deposit amount: ");
        depositAmount=scanner.nextDouble();

        balance=balance+depositAmount;
    }

    void withdraw(Scanner scanner){
        System.out.println("Enter a withdraw amount: ");
        withdrawAmount=scanner.nextDouble();

        if(withdrawAmount<=balance){
            balance=balance-withdrawAmount;
            System.out.println("Amount withdraw successfully");
        }else {
            System.out.println("Insuffient Balance");
        }
    }

    void checkBalance(){
        System.out.println("Customer name: "+customerName);
        System.out.println("Bank account number: "+accountNumber);
        System.out.println("Bank Balance: "+balance);
    }
}
public class Program7 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a customer name: ");
        String name=scanner.nextLine();

        System.out.println("Enter a account number: ");
        long accNum=scanner.nextLong();

        System.out.println("Enter a account balance: ");
        double bal=scanner.nextDouble();

        BankAccount bankAccount=new BankAccount();
        bankAccount.getAccount(name,accNum,bal);

        int choice;
        do{

            System.out.println(" 1. Check Bank Balance");
            System.out.println(" 2. Deposit Amount");
            System.out.println(" 3. Withdraw Amount");
            System.out.println(" 4. Exit");
            System.out.println("Enter your choice ");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    bankAccount.checkBalance();
                    break;
                case 2:
                    bankAccount.deposit(scanner);
                    bankAccount.checkBalance();
                    break;
                case 3:
                    bankAccount.withdraw(scanner);
                    bankAccount.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Please enter  valid choice:  ");
            }
        }while (choice!=4);
    }
}
