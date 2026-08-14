package Basicsjava.OOP.Inheritance.HierarchicalInheritance;

class Bank{
    String bankName="State Bank of India";
    String branchName="Nandurbar";

    void displayBankDetails(){
        System.out.println("Bank Name: "+bankName);
        System.out.println("Branch Name: "+branchName);
    }
}

class SavingAccount extends Bank{
    long accountNumber=1234567890L;
    String coustomerName="Aditya Gavit";
    double balance=535.41;
    int interestRate=10;

    void calculateInterest(){
        double interest=balance*interestRate/100;
        balance=balance-interest;
        System.out.println("Total Interest: "+interest);
        double totalBalance=balance+interest;
        System.out.println("Total balance: "+totalBalance);
    }
}

class CurrentAccount extends Bank{
    long accountNumber1=1234567890L;
    String coustomerName1="Aditya Gavit";
    double balance=535.41;
    int minmumBalance=500;

    void calculatePenalty(){
        if(balance<minmumBalance){
            balance=balance-500;
            System.out.println("balance after penalty:"+balance);
        }else {
            System.out.println("Total balance: "+balance);
        }
    }
}

class LoanAccount extends Bank{
    String coustomerName3="Aditya Gavit";
    double loanAmount=1000;
    int interestRate=12;

    void calculateSimpleInterest(){
        int year=2;
        double simpleInterest=(loanAmount*interestRate*year)/100;
        System.out.println("Simple Interest: "+simpleInterest);
        loanAmount=loanAmount+simpleInterest;
        System.out.println("Total Loan Amount Paid: "+loanAmount);
    }
}

public class Program1 {
    public static void main(String[] args){
        System.out.println("---Bank Detail---");
        LoanAccount loanAccount=new LoanAccount();
        loanAccount.displayBankDetails();
        System.out.println("---Saving Account---");
        SavingAccount savingAccount=new SavingAccount();
        System.out.println("Account Number: "+savingAccount.accountNumber);
        System.out.println("Coustomer Name: "+savingAccount.coustomerName);
        savingAccount.calculateInterest();
        System.out.println("---Current Account---");
        CurrentAccount currentAccount=new CurrentAccount();
        System.out.println("Account Number: "+currentAccount.accountNumber1);
        System.out.println("Coustomer Name: "+currentAccount.coustomerName1);
        currentAccount.calculatePenalty();
        System.out.println("---Loan Account Details---");
        System.out.println("Customer Name: "+loanAccount.coustomerName3);
        loanAccount.calculateSimpleInterest();
    }
}
