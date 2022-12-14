package chapterTwo;
import java.util.Scanner;
        public class Product{
            public static void main(String[] args){
                Scanner input =new Scanner(System.in);
                System.out.println("Enter first integer");
                int x = input.nextInt();
                System.out.println("Enter second integer");
                int y = input.nextInt();
                System.out.println("Enter third integer");
                int z = input.nextInt();
                int variableResult = (x * y * z);
                System.out.printf("Product is %d%n",variableResult);






            }


}
