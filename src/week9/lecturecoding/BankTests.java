package week9.lecturecoding;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class BankTests {

    private void checkArrayListsOfBankAccounts(ArrayList<BankAccount> expected, ArrayList<BankAccount> actual) {
        assertNotNull(actual);
        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            BankAccount expectedAccount = expected.get(i);
            boolean found = false;
            for (int j = 0; j < expected.size(); j++) {
                BankAccount actualAccount = actual.get(j);
                if (expectedAccount.getAccountHolder().equals(actualAccount.getAccountHolder())) {
                    if (Math.abs(expectedAccount.checkAccount() - actualAccount.checkAccount()) < 0.001) {
                        found = true;
                    }
                }
            }
            assertTrue(found);
        }
    }

    @Test
    public void testBank() {
        Bank bank = new Bank();

        double threshold = 100.0;

        bank.addAccount(new BankAccount("Tomato", 20.0));
        bank.addAccount(new BankAccount("Shads", 100.01));
        bank.addAccount(new BankAccount("Andrew", 480.50));
        bank.addAccount(new BankAccount("Em", 99.99));
        bank.addAccount(new BankAccount("Kingly", 120.0));

        ArrayList<BankAccount> expected = new ArrayList<>(Arrays.asList(
                new BankAccount("Shads", 100.01),
                new BankAccount("Andrew", 480.50),
                new BankAccount("Kingly", 120.0)
        ));

        ArrayList<BankAccount> actual = bank.getLargeAccounts(threshold);

        this.checkArrayListsOfBankAccounts(expected, actual);
    }


    @Test
    public void testBankAccount() {
        BankAccount account = new BankAccount("Matt", 100.0);
        assertEquals(100.0, account.checkAccount(), 0.001);

        account.deposit(5.5);
        assertEquals(105.5, account.checkAccount(), 0.001);

        account.deposit(1.0);
        assertEquals(106.5, account.checkAccount(), 0.001);

        account.withdraw(10.0);
        assertEquals(96.5, account.checkAccount(), 0.001);

        BankAccount myAccount = new BankAccount("Jesse", 19.95);

        assertEquals(1.5, myAccount.checkAccount(), 19.95);

        account.transfer(myAccount, 50.55);

        assertEquals(45.95, account.checkAccount(), 0.001);
        assertEquals(70.5, myAccount.checkAccount(), 0.001);

        assertFalse(account.isOverdrawn());
        assertFalse(myAccount.isOverdrawn());

        account.withdraw(50.0);
        assertEquals(-4.05, account.checkAccount(), 0.001);
        assertTrue(account.isOverdrawn());
    }


}
