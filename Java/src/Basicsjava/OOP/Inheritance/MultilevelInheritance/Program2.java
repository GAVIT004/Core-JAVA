package Basicsjava.OOP.Inheritance.MultilevelInheritance;
class Bank{
    String bankName="State Bank Of India";
    String branch="Nandurbar";
}
class Account extends Bank{
    int accountNumber=123456789;
    String coustomerName="Aditya Gavit";
    double balance=45363.134;

}
class SavingAccount extends Account{
    int interestrate=10;
    void interest(){
        balance=balance*interestrate/100;
        System.out.println("Interest amount: "+balance);
    }
}
public class Program2 {
    public static void main(String[] args){
        SavingAccount savingAccount=new SavingAccount();
       System.out.println(savingAccount.bankName);
       System.out.println(savingAccount.branch);
       System.out.println(savingAccount.accountNumber);
       System.out.println(savingAccount.coustomerName);
       System.out.println(savingAccount.balance);
       System.out.println(savingAccount.interestrate);
       savingAccount.interest();

    }
}
