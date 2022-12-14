package chapterTwo;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        Account account = new Account();
        String name = input.nextLine();
        account.setName(name);
        System.out.printf("my account name is %s%n",account.getName());
        account.deposit(20000);
        System.out.printf("my balance is %.2f%n",account.getBalance());
        account.withdraw(10000);
        System.out.printf("the current balance is %.2f%n", account.getBalance());


    }
}
