package Basicsjava.Oprators.AssignmentOprators;

class BankAcount{
    void diposite(int balance){
        balance+=500;
        System.out.println("Amount deposite succesfully: "+balance);
    }
    void withdraw(int balance){
        balance-=300;
        System.out.println("Amount withdraw succesfully: "+balance);
    }
}

public class AssignmentOprators2 {
    public static void main(String[] args){
        int initialBalance=5000;
        BankAcount bankAcount=new BankAcount();
        bankAcount.diposite(initialBalance);;
        bankAcount.withdraw(initialBalance);
        System.out.println("Orignal Balance: "+initialBalance);

    }

}
