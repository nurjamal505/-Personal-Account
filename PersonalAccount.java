/**
 * This class represents a personal bank account.
 * It allows deposits, withdrawals, and keeps track of transaction history.
 */
public class PersonalAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;
    private Amount[] transactions;
    private int transactionCount;

    /**
     * Constructs a PersonalAccount with the given account number and account holder.
     * The balance is initialized to 0.
     *
     * @param accountNumber   the unique account number
     * @param accountHolder   the name of the account holder
     */
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new Amount[100]; // Capacity for 100 transactions
        this.transactionCount = 0;
    }

    /**
     * Deposits a specified amount into the account and records the transaction.
     *
     * @param amount the amount to be deposited
     */
    public void deposit(double amount) {
        balance += amount;
        transactions[transactionCount++] = new Amount(amount, TransactionType.DEPOSIT);
    }

    /**
     * Withdraws a specified amount from the account if sufficient funds are available.
     * Records the transaction.
     *
     * @param amount the amount to be withdrawn
     * @throws IllegalArgumentException if the withdrawal amount exceeds the balance
     */
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        transactions[transactionCount++] = new Amount(amount, TransactionType.WITHDRAWAL);
    }

    /**
     * Prints the history of transactions for this account.
     */
    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i].getTransactionType() + ": " + transactions[i].getAmount());
        }
    }

    /**
     * Gets the current balance of the account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets the account number.
     *
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Gets the account holder's name.
     *
     * @return the account holder's name
     */
    public String getAccountHolder() {
        return accountHolder;
    }
}
