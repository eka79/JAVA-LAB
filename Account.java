package BankAccount;

public class Account {
    double balance;
    static final double MIN_BALANCE = 500;

    public Account() {
        balance = MIN_BALANCE;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + "\n New balance: " + balance);
    }
    public void withdraw(double amount) throws LessBalanceException {
        if (balance - amount < MIN_BALANCE) {
            throw new LessBalanceException(amount);
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + "\n New balance: " + balance);
    }
    public double getBalance() {
        return balance;
    }

}
