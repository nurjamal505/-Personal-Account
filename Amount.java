public class Amount {
    private double amount;
    private TransactionType transactionType;

    public Amount (double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return this.amount;
    }
    public TransactionType getTransactionType() {
        return this.transactionType;
    }
    public String toString () {
    return this.transactionType + " :" + this.amount;
    }
}
