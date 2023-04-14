package problemSolvingJava;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         while (true){
             System.out.println("Enter your guessed birthday date!!");
             int dateNumber = input.nextInt();
             if (dateNumber > 22)
                 System.out.println("Incorrect guess");
             if (dateNumber < 22)
                 System.out.println("Try again");
             if(dateNumber == 22)
                break;
         }
        }
    }



