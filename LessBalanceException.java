package BankAccount;

public class LessBalanceException extends Exception {
    public LessBalanceException(double amount) {
        super("Withdraw amount("+amount+") not possible");
    }
}
