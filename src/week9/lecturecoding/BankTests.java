package week9.lecturecoding;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;


public class BankTests {

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

    @Test
    public void testBank(){

    }

}
