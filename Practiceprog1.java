package Basicsjava;

import java.util.Scanner;

class ATM{
    String accountHolderName;
    double balance;

    ATM(String name,double bal){
        accountHolderName=name;
        balance=bal;
    }

    void Deposite(double amount){
        balance=balance+amount;
        System.out.println("$"+amount+"deposite succsefully");
    }

    void Widrawal(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("$"+amount+"widrawal succsefully");

        }else{
            System.out.println("Incuffisient balance");
        }
    }

    void Cheakbalance(){
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Balance: "+balance);
    }

}


public class Practiceprog1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Bnk Account Holder Name: ");
        String name= sc.next();
        System.out.println("Enter Bank Account Balance: ");
        double bal= sc.nextDouble();
        ATM atm=new ATM(name,bal);
        System.out.println("Enter a deposite amount: ");
        double amountDeposite=sc.nextDouble();
        atm.Deposite(amountDeposite);
        System.out.println("Enter widrawal amount:");
        double amountWidrawal=sc.nextDouble();
        atm.Widrawal(amountWidrawal);
        atm.Cheakbalance();





    }
}
