package tdd;

import AccountApp.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Account2Test {
    Account account;
    @BeforeEach
        public void beforeAll(){
         account = new Account(1,"Black favour", "1234");
    }

    @Test
    public void depositTest(){
        account.deposit(1500);
        assertEquals(1500, account.checkBalance("1234"));

    }
    @Test
    public void checkBalanceWithWrongPinReturnZeroTest(){
        Account account = new Account(1,"Black favour", "1234");
        account.deposit(1500);
        assertEquals(1500, account.checkBalance("1234"));
    }
    @Test
    public void WithDrawMoneyTest(){
        account.deposit(800);
        account.withdraw(400,"1234");
        assertEquals(400,account.checkBalance("1234"));
    }
    @Test
    public void checkThatWithdrawWithWrongPinDoesNotWorkTest(){
        account.deposit(8000);
        account.withdraw(4000,"1234");
        assertEquals(4000, account.checkBalance("1234"));
    }

    }