package chapterTwo;
  import java.util.Scanner;
public class guessNumber {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("guessNumber");
    int guessNumber = input.nextInt();
    int number = 80;
    if (guessNumber < number){
        System.out.println("too low");
    }
      if (guessNumber > number){
          System.out.println("too high");
      }
       if (guessNumber == number){
           System.out.println("correct");




       }

    }









}
