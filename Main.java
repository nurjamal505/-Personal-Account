public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(12345, "Arthur Morgan");

        account.deposit(1000.0);
        account.withdraw(500.0);
        account.deposit(150.0);

        System.out.println("Current Balance: " + account.getBalance());

        account.printTransactionHistory();
    }
}