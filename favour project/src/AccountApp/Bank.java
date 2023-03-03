package AccountApp;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int noOfAccounts;
    private String bankName;
    private List<Account> accounts;
    private int balance;

    public Bank(String bankName) {
        this.bankName = bankName;
         accounts = new ArrayList<>();
    }

    public void createAccountFor(String accountName, String accountPin) {
        int accountNumber = generateAccountNumber();
        Account account= new Account(accountNumber, accountName, accountPin);
        accounts.add(account);
    }

    private int generateAccountNumber() {
        return ++ noOfAccounts;
    }

    public int countNumberOfAccount() {
        return accounts.size();
    }

    public int checkBalanceFor(int accountNumber,String accountPin) {
        Account foundAccount = findAccountNumber(accountNumber);
        if (foundAccount != null) {
            return foundAccount.checkBalance(accountPin);
        }
        return balance;
    }

    public void deposit(int amount,int accountNumber) {
        Account foundAccount = findAccountNumber(accountNumber);
        if (foundAccount != null) {
            foundAccount.deposit(amount);
        }
    }

    private Account findAccountNumber(int accountNumber) {
        for(Account account: accounts){
            boolean accountNumberMatches = account.getAccountNumber() == accountNumber;
            if(accountNumberMatches)return account;
        }
        return null;
    }


    public void transfer(int amount, int senderAccountNumber, int receiverAccountNumber, String senderPin) {
        Account senderAccount = findAccountNumber(senderAccountNumber);
        Account receiverAccount = findAccountNumber(receiverAccountNumber);
        if (senderAccount != null) {
            senderAccount.withdraw(amount,senderPin);
        }
        if (receiverAccount != null) {
            receiverAccount.deposit(amount);
        }
    }

    public void withdraw(int amount, int accountNumber, String pin) {
        for (Account account:accounts)
            if (account.getAccountNumber()== accountNumber)
                account.withdraw(amount,pin);
    }
}

