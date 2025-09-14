package q1_bankaccount;

public class BankAccountService {
    public void performTransactions(BankAccount account) {
        account.deposit(200);
        account.withdraw(150);
        account.displayAccountDetails();
    }
}
