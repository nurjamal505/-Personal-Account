/**
 * This class represents the amount for a specific transaction.
 * It includes the amount and the type of transaction (DEPOSIT or WITHDRAWAL).
 */
public class Amount {

    private double amount;
    private TransactionType transactionType;

    /**
     * Constructs an Amount object with a given amount and transaction type.
     *
     * @param amount          the amount of the transaction
     * @param transactionType the type of transaction (DEPOSIT or WITHDRAWAL)
     */
    public Amount(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    /**
     * Gets the transaction amount.
     *
     * @return the transaction amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Gets the transaction type.
     *
     * @return the transaction type (DEPOSIT or WITHDRAWAL)
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }
}
