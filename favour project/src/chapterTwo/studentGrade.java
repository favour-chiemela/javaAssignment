package chapterTwo;

import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int grade = 0;
        int counter = 0;
        System.out.print("Enter the first grade or -1 to stop ");
        grade = input.nextInt();

        while (grade != -1) {
            total += grade;
            counter++;
            System.out.print("Enter the next grade or -1 to stop ");
            grade = input.nextInt();
        }
        if (counter != 0) {
            int average = total / counter;
            System.out.println("Average is:" + average);
        } else {
            System.out.println("no grades where entered");
        }
    }
}












