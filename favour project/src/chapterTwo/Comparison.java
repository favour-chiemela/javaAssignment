package chapterTwo;

import java.util.Scanner;

public class Comparison{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer");
        int number1 = input.nextInt();
        System.out.println("Enter second integer");
        int number2 = input.nextInt();
        if (number1 == number2){
            System.out.println(" equal to");
        }
        if (number1 != number2){
            System.out.println("not equal to");
        }
        if (number1 < number2){
            System.out.println("the number is less than");
        }
    }
}
