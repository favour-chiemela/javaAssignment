package chapterTwo;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
    loop();
    }
    public static void loop(){
        int counter = 0;
        while (counter<2){
            method();
            counter++;
            System.out.println(counter);
        }
    }
    public static void method(){
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Enter 1-> To run
                Enter 2-> To sit down
                Enter 3-> To jump up
                Enter 4-> To fly
                Enter 5-> To come to me
                Enter 6-> To dance
                Enter 7-> To slap
                Enter 8-> To walk
                Enter 9-> To jump in the lagoon
                Enter 10-> To go home""");
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("pls run");
                break;
            case 2:
                System.out.println("pls sit down");
                break;
            case 3:
                System.out.println("pls jump up");
                break;
            case 4:
                System.out.println("u can fly");
                break;
            case 5:
                System.out.println("come to me");
                break;
            case 6 :
                System.out.println("pls dance");
                break;
            case 7:
                System.out.println("pls slap ur self");
                break;
            case 8:
                System.out.println("pls walk");
                break;
            case 9:
                System.out.println("jump in the lagoon");
                break;
            case 10: System.out.println("go home");
                break;
            default:
                System.out.println("Enter 1 to go to back or 0 to terminate");

        }
    }
}
