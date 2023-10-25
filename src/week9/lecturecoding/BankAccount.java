package week9.lecturecoding;

public class BankAccount {

    private String accountHolder;
    private double money;

    public BankAccount(String accountHolder, double initialInvestment){
        this.accountHolder = accountHolder;
        this.money = initialInvestment;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double checkAccount(){
        return this.money;
    }

    public void deposit(double amount){
        this.money += amount;
    }

    public void withdraw(double amount){
        this.money -= amount;
    }

    public void transfer(BankAccount other, double amount){
        this.withdraw(amount);
        other.deposit(amount);
    }

    public boolean isOverdrawn(){
        return this.money < 0.0;
    }



}
