import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount >=  0) {
            balance += amount;
            transactions.add(new Amount(amount, TransactionType.DEPOSIT));
        }
    }

    public void withdraw(double amount) {
        if (amount >= 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Amount(amount, TransactionType.WITHDRAWAL));
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for Account #" + accountNumber);
        for (Amount transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
