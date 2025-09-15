package q4_bankingsystem;

public abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { if (amount>0) balance += amount; }
    public void withdraw(double amount) { if (amount>0 && amount<=balance) balance -= amount; }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
    boolean isEligibleForLoan();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan() {
        System.out.println("SavingsAccount: Loan application submitted.");
    }

    @Override
    public boolean isEligibleForLoan() {
        return balance >= 1000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan() {
        System.out.println("CurrentAccount: Loan application submitted.");
    }

    @Override
    public boolean isEligibleForLoan() {
        return balance >= 5000;
    }
}
