package chapterTwo;

import java.util.Scanner;

public class Comparing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one integer");
        int number = input.nextInt();
        int y = (number*number);
        if(number == 100){
            System.out.println("The number is equal 100");
        if( y == 100){
        System.out.print("the square root is equal to 100");
        }
        }
        if(number > 100){
            System.out.println("the number is greater than 100");
        if(y > 100){
         System.out.print("the square root is greater than 100");
        }
        }
        if(number < 100){
            System.out.println("the number is lesser than 100");
         if(y < 100){
             System.out.println("the square root is lesser");
         }
        }
    }
}
