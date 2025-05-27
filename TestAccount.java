package BankAccount;

public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();

        account1.deposit(100);
        account2.deposit(200);

        try{
            account1.withdraw(200);
        }catch (LessBalanceException e){
            System.out.println("LessBalanceException "+e.getMessage());
        }

        try{
            account2.withdraw(50);
        }catch (LessBalanceException e) {
            System.out.println("LessBalanceException "+e.getMessage());
        }
    }
}
