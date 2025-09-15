package q4_bankingsystem;

public class BankMain {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount("S-100", "Anita", 12000);
        BankAccount ca = new CurrentAccount("C-200", "Ramesh", 3000);

        BankService svc = new BankService();
        svc.printAccountSummary(sa);
        System.out.println();
        svc.printAccountSummary(ca);
    }
}
