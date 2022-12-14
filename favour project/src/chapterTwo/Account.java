package chapterTwo;

public class Account {
    private String accountName;
    private double balance;
    private double withdraw;

    public void setName(String accountName){
      this.accountName = accountName;
    }
    public String getName(){
        return accountName;
    }
    public void deposit(double cash){

        if (cash > 0) balance += cash;
    }
    public double getBalance(){
        return balance;
    }
    public double checkBalance(){
        return balance;
    }
    public void withdraw(double cash) {
        if (cash > balance){
        System.out.println("insufficient funds");
    }else
        if(cash > 0 && cash < balance){
        balance -= cash;
        }
        else{
            System.out.println("invalid  transaction");
        }
    }

}









