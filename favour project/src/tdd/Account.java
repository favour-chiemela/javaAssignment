package tdd;

public class Account {
    private int balance;
    private double withdraw;
    private int  number;

    public void deposit(int cash){
    if(cash >= 0)  balance += cash;
    }
    public int getBalance() {
        return balance;
    }

    public void withdraw(int cash){
    if (cash >= 0) balance -= cash;
    }

    public void setPin(int number){
        this.number = number; 

    }

}
