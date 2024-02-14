package ExceptionsTest;

import CustomExceptions.BankAccount;
import CustomExceptions.InsufficientFundsException;
import CustomExceptions.InvalidWithdrawalException;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testSuccessfulWithdrawal() throws InsufficientFundsException, InvalidWithdrawalException {
        BankAccount account = new BankAccount(1000);
        account.withdraw(500);
        assertEquals(500, account.getBalance(), 0.001);
    }

    @Test(expected = InsufficientFundsException.class)
    public void testWithdrawalExceedsBalance() throws InsufficientFundsException, InvalidWithdrawalException {
        BankAccount account = new BankAccount(1000);
        account.withdraw(1500);
    }

    @Test(expected = InvalidWithdrawalException.class)
    public void testNegativeWithdrawal() throws InsufficientFundsException, InvalidWithdrawalException {
        BankAccount account = new BankAccount(1000);
        account.withdraw(-200);
    }
}
