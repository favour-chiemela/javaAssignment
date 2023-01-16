package chapterTwo;

import java.util.Scanner;

public class classAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter= 0;
        System.out.println("Enter the first grade or -1 to exit");
        int grade = input.nextInt();
        while (grade != -1){
            total =   total + grade;
            gradeCounter++;
            System.out.println("Enter the next grade or -1 to exit");
            grade = input.nextInt();


        }
            int average = total / gradeCounter;
        System.out.printf("the total grades is: %d%n", total);
            System.out.printf("average is %d%n" , average);
        }
    }

