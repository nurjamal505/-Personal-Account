import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonalAccountTest {

    @Test
    public void testDeposit() {
        PersonalAccount account = new PersonalAccount(12345, "Alice");
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        PersonalAccount account = new PersonalAccount(12345, "Bob");
        account.deposit(200.0);
        account.withdraw(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        PersonalAccount account = new PersonalAccount(12345, "Charlie");
        account.deposit(100.0);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200.0);
        });
    }

    @Test
    public void testTransactionHistory() {
        PersonalAccount account = new PersonalAccount(12345, "David");
        account.deposit(300.0);
        account.withdraw(100.0);
        account.printTransactionHistory();  // Output should be checked manually for this test
    }
}
