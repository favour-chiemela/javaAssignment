package AccountApp;

import javax.swing.*;
import java.util.Scanner;

public class AtmMachine {
    private static Bank bank = new Bank("Access Bank");
    public static void main(String[] args) {
        displayMainMenu();
    }
    private static void displayMainMenu(){
        String mainMenu = """
                Welcome to Access Bank
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                """;
        System.out.println(mainMenu);
        Scanner scanner = new Scanner(System.in);
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createAccount();

            case '2' -> deposit();

            case '3' ->  withdraw();

            case '4' -> transfer();

            case '6' -> checkBalance();
            default -> {
            }
        }
    }
    private static void createAccount(){
        String accountName = input("What is the account name?");
        String accountPin = input("What is the account pin?");
        bank.createAccountFor(accountName, accountPin);
        display("Account created successfully");
        displayMainMenu();
    }

    private static void checkBalance() {
        int accountNumber = Integer.parseInt(input("What is your account number?"));
        String pin = input("Please enter pin");
        int balance = bank.checkBalanceFor(accountNumber,pin);
        display("Your balance is " + balance);
        displayMainMenu();
    }
    private static void deposit(){
        int accountNumber = Integer.parseInt(input(("What is your account number?")));
        int amount  = Integer.parseInt(input("How much do you want to deposit?"));
        bank.deposit(amount,accountNumber);
        display("Deposited successfully");
        displayMainMenu();
    }
    private static void transfer(){
        int senderAccountNumber = Integer.parseInt(input("Please type your account number!!"));
        int receiverAccountNumber = Integer.parseInt(input("Please type in the receivers account number!!"));
        String senderPin = input("Please enter your pin!!");
        bank.deposit(10000,1);
        bank.transfer(5000,senderAccountNumber,receiverAccountNumber, senderPin);
        display("Transfer successful!!!");
        displayMainMenu();
    }
    private static void withdraw(){
        int accountNumber = Integer.parseInt(input("What is your account number"));
        int amount = Integer.parseInt(input("How much do you want to withdraw?"));
        String pin = input("Please enter your pin");
        bank.deposit(2000, 1);
        bank.withdraw(amount, accountNumber,pin);
        display("Your withdraw has been successful");
        displayMainMenu();
    }
    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(prompt);
//        return scanner.nextLine();
    }
    private static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
        //System.out.println(message);
    }

}
