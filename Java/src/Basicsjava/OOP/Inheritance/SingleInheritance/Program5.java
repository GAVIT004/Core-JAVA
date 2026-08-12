package Basicsjava.OOP.Inheritance.SingleInheritance;
class Bank{
    void openAccount(){
        System.out.println("Bank account is open");
    }
}
class SavingsAccount extends Bank{
    void depositeMoney(){
        System.out.println("Deposite successful");
    }
}
public class Program5 {
    public static void main(String[] args){
        SavingsAccount savingsAccount=new SavingsAccount();
        savingsAccount.openAccount();
        savingsAccount.depositeMoney();
    }

}
