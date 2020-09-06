package entities;

public class Account {

    private int accountNumber;
    private String holder;
    private double balance;

    public Account() {
    }

    public Account(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public Account(int accountNumber, String holder, double inititalDeposit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(inititalDeposit);
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double Amount) {
        balance += Amount;
    }

    public void withdraw(double Amount) {
        balance -= Amount + 5.00;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
