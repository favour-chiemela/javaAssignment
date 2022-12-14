package chapterTwo;

import java.util.Scanner;
public class RunwayLength {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the velocity");
       double velocity = input.nextDouble();
       System.out.print("Enter the acceleration");
       double acceleration = input.nextDouble();
       double length = (velocity * velocity) / (2 * acceleration);
       System.out.printf("The length is %f%n",length);






    }
}
