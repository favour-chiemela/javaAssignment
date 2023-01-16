package chapterTwo;

import java.util.Scanner;

public class numberOfPasses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failure = 0;
        int studentCounter = 1;
        while (studentCounter <= 10) {
            System.out.println("Enter the exam result (1= passed, 2= failed):");
            int examResult = input.nextInt();

            if (examResult == 1) {
                passes = passes + 1;
            } else {
                failure = failure + 1;
                studentCounter = studentCounter + 1;
            }
            System.out.println("the number of passes is:" + passes);
            System.out.println("the number of failure is:" + failure);

        }
        if (passes < 8) {
            System.out.println("Bonus to instructor!!!");
        }
    }
}