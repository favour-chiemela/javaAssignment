package chapterTwo;

import java.util.Scanner;

public class Arithmetic{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int x = input.nextInt();
        System.out.println("Enter the second integer");
        int y = input.nextInt();
        int z=(x*x) - (y*y);
        System.out.println("The arithmetic number is" + z);




    }



}
