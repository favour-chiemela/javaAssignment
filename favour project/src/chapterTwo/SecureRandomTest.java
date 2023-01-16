package chapterTwo;

import java.security.SecureRandom;

public class SecureRandomTest {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int counter = 1;
        for (int i = 1; i <= 10; i++) {
            int count = 1 + secureRandom.nextInt(10);
            System.out.print(count + "  ");
            if (i % 5 == 0) {
                System.out.println();


            }

        }
    }
}