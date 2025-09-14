package q1_bankaccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
        BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.00);

        System.out.println("\nAccount 1 Details:");
        account1.displayAccountDetails();
        System.out.println("\nAccount 2 Details:");
        account2.displayAccountDetails();

        BankAccount.getTotalAccounts();

        BankAccountService service = new BankAccountService();
        System.out.println("\nPerforming transactions on Account 1:");
        service.performTransactions(account1);
    }
}
