package q4_bankingsystem;

public class BankService {
    public void printAccountSummary(BankAccount acc) {
        System.out.println("Account: " + acc.getAccountNumber() + " Holder: " + acc.getHolderName());
        System.out.println("Balance: " + acc.getBalance());
        System.out.println("Interest: " + acc.calculateInterest());
        if (acc instanceof Loanable) {
            System.out.println("Loan eligible: " + ((Loanable) acc).isEligibleForLoan());
        }
    }
}
