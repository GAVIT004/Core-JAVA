package Basicsjava.OOP.Encapsulation;

public class Account {

    private double balance;

    public double getBalance(){
        //Validation
        return balance;
    }

    public void getBalance(double balance){
        //Validation
        this.balance=balance;
    }
}
