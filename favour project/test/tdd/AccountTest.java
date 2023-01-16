package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositMoneyTest(){
     // given that malik has an new account
   Account malikAccount = new Account();
     // when malik deposits 23
        malikAccount.deposit(23);
        // check that the balance is 23
        int balance = malikAccount.getBalance();
        assertEquals(23,balance);

    }
    @Test
    public void depositTwiceTest(){
        //given malik has account;
        Account malikAccount = new Account();
        // given there is 300 in the account;
        malikAccount.deposit(300);
        int balance = malikAccount.getBalance();
        assertEquals(300,balance);
        //when i try to deposit 200;
        malikAccount.deposit(200);
        //check that balance is 500;
        balance = malikAccount.getBalance();
        assertEquals(500, balance);
    }
    @Test
    public void depositNegativeAmountTest(){
        //given i have an account with zero balance;
        Account malikAccount = new Account();
        //when i try to deposit negative amount(-2300);
        malikAccount.deposit(-2300);
        //check that balance is zero
        int balance = malikAccount.getBalance();
        assertEquals(0, balance);
    }

     //
    @Test
    public void withdrawMoneyTest(){
        //given malik has an account;
        Account malikAccount = new Account();
        //given that he deposited 4000 in his account;
        malikAccount.deposit(4000);
        int balance = malikAccount.getBalance();
        //when i withdraw 2000;
        malikAccount. withdraw(2000);
         balance = malikAccount.getBalance();
        assertEquals(2000,balance);

    }
    @Test
    public void withdrawMoneyTwiceTest(){
        //given malik has an account ;
        Account malikAccount = new Account();
        //given he deposited 4000
        malikAccount.deposit(4000);
        int balance = malikAccount.getBalance();
        //when i withdraw a negative amount -6000
        malikAccount.withdraw(-6000);
        balance = malikAccount.getBalance();
         assertEquals(4000,balance);


    }
    @Test
    public void withdrawMoneyThriceTest(){
        //giving that malik has an account
        Account malikAccount = new Account();
        //giving that i have 4000 in my account
        malikAccount.deposit(4000);
        int balance = malikAccount.getBalance();
        //when i want to withdraw 1000;
         malikAccount.withdraw(1000);
         balance = malikAccount.getBalance();
         //when i want to withdraw 500
        malikAccount.withdraw(500);
        balance = malikAccount.getBalance();
        assertEquals(2500, balance);

    }
}
