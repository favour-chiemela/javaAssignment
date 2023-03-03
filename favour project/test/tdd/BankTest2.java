package tdd;

import AccountApp.Account;
import AccountApp.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest2 {
   Bank bank;

    @BeforeEach
    public void BeforeAll(){
        bank = new Bank("AccessBank");
        bank.createAccountFor("legend", "1234");
        bank.createAccountFor("Abraham","1234");

    }
    @Test
    public void creatAccount(){
        bank.createAccountFor("Kinzy", "pin");
        assertEquals(1,bank.countNumberOfAccount());
    }
    @Test
    public void checkBalanceOfNewAccountIsZeroByDefault(){
        bank.createAccountFor("Favour", "pin");
        assertEquals(0,bank.checkBalanceFor(1,"pin"));
    }
    @Test
    public void depositIntoAccount(){
        bank.createAccountFor("favour", "pin");
        bank.deposit(5000, 1);
        assertEquals(5000,bank.checkBalanceFor(1,"pin"));
    }
    @Test
    public void transferMoneyTest(){
        bank.createAccountFor("Favour Black", "pin");
        bank.createAccountFor("felix", "favour");
        bank.deposit(4500,1);
        bank.transfer(2000,1 ,2, "pin");
        assertEquals(2500,bank.checkBalanceFor(1,"pin"));
        assertEquals(2000,bank.checkBalanceFor(2,"favour"));
    }
    @Test
    public void withdrawMoneyTest(){
        bank.createAccountFor("felix", "1234");
        bank.deposit(40000,12345768);
        bank.withdraw(10000,12345768,"1234");
        assertEquals(30000,bank.checkBalanceFor(12345768,"1234"));

    }
}
