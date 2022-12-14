package chapterTwo;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Read an integer");
        int number = input.nextInt();
        if(number % 3 == 0){
            System.out.printf("the number is divisible by %d%n",3);
        }



    }
}
