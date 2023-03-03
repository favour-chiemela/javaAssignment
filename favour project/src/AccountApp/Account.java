package AccountApp;

public class Account {
    private int balance;
    private String pin;
    private String accountName;
    private int accountNumber;
    private int amount;

    public Account(int accountNumber, String accountName, String pin){
        this.accountName = accountName;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }
    public void deposit(int amount) {
        balance += amount;
    }

    public int checkBalance(String pin) {
        if(pinIsCorrect(pin)) return balance;
        return 0;
    }

    private boolean pinIsCorrect(String pin) {
        return this.pin.equals(pin);
    }

    public void withdraw(int amount, String pin) {
        if (pinIsCorrect(pin)) balance-= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }



}
