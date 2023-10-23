package week9.lecturecoding;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;


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
        assertEquals(1.5, account.checkAccount(), 0.001);


    }


}
