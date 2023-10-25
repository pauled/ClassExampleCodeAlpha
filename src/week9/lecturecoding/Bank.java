package week9.lecturecoding;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account){
        this.accounts.add(account);
    }


    /**
     * Returns all the accounts that have a large amount of money
     * @param threshold the amount that defines "large"
     * @return An ArrayList of all BankAccounts containing more than
     *         threshold dollars
     */
    public ArrayList<BankAccount> getLargeAccounts(double threshold){
        ArrayList<BankAccount> largeAccounts = new ArrayList<>();
        for(BankAccount account : this.accounts){
            if(account.checkAccount() > threshold){
                largeAccounts.add(0, account);
            }
        }
        return largeAccounts;
    }

}
