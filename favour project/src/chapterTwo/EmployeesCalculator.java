package chapterTwo;

import java.util.Scanner;

public class EmployeesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int employeeWorkedPerHours = input.nextInt();
        System.out.println("first 40 hours worked per hour");
        int employedWorkerPerHour = 50;
        System.out.println("gross pay = 50 per hour");
        int workPerHalfHour = 25;
        System.out.println("gross pay = 25 per half hour worked per each employee");
        if(employedWorkerPerHour < 40){
            System.out.println("you are fired");
        }else if (employedWorkerPerHour == 40){
            double grossPay = 40 * 50;
            System.out.println("the gross pay for 40 hours is 2000 gross pay");
        } else if (workPerHalfHour == 25){
            double grossPay = 40 * 25;
            System.out.println("the gross pay for 40 and half hour is 3000 grossPay");
        } System.out.printf("the pay for regular hours is 2000%n" + "the pay for half hours is 1000%n");


    }
}
