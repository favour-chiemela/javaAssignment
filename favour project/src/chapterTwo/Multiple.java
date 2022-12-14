package chapterTwo;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer");
        int x = input.nextInt();
        System.out.println("Enter second integer");
        int y = input.nextInt();
        int doubled = x * 2;
        int tripled = y * 3;
        if (tripled % doubled == 0){
            System.out.println("result"  + doubled / tripled);
        }


    }
}
