package chapterTwo;

import java.util.Scanner;

    public class Acceleration {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the starting velocity");
            double startingVelocity = input.nextDouble();
            System.out.println("Enter the ending velocity");
            double endingVelocity = input .nextDouble();
            System.out.println("Enter the time");
            double time = input.nextDouble();
            double averageAcceleration = (endingVelocity - startingVelocity) / (time);
            System.out.printf("The averageAcceleration is %f%n",averageAcceleration );


        }




}
