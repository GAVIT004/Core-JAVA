
package Basicsjava.ExceptionHandling.CustomizedExceptionHandling;

import java.util.Scanner;

class Atm {

    private double accountBalance;
    private double withdrawAmount;

    public Atm(double accountBalance, double withdrawAmount) {
        this.accountBalance = accountBalance;
        this.withdrawAmount = withdrawAmount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}

public class Program10 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter withdrawal amount: ");
            double withdrewAmount = scanner.nextDouble();

            Atm atm = new Atm(5000, withdrewAmount);

            System.out.println("ATM transaction started");

            try {
                try {
                    if (atm.getWithdrawAmount() <= 0) {
                        throw new IllegalArgumentException(
                                "Amount must be greater than 0."
                        );
                    }

                    System.out.println("Withdrawal amount is valid");

                    if (atm.getWithdrawAmount()
                            > atm.getAccountBalance()) {
                        throw new ArithmeticException(
                                "Insufficient balance"
                        );
                    }

                    atm.setAccountBalance(
                            atm.getAccountBalance()
                                    - atm.getWithdrawAmount()
                    );

                    System.out.println("Withdrawal successful");
                    System.out.println(
                            "Withdrawn: Rs. " + atm.getWithdrawAmount()
                    );
                    System.out.println(
                            "Remaining balance: Rs. "
                                    + atm.getAccountBalance()
                    );

                } catch (IllegalArgumentException e) {
                    System.out.println(
                            "Invalid input: " + e.getMessage()
                    );

                } finally {
                    System.out.println(
                            "Amount validation completed"
                    );
                }

            } catch (ArithmeticException e) {
                System.out.println(
                        "Transaction failed: " + e.getMessage()
                );

            } finally {
                System.out.println("ATM transaction completed");
            }

            System.out.println("Please collect your card");
        }
    }
}
