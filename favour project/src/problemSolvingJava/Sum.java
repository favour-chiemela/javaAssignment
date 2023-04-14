package problemSolvingJava;

public class Sum {
    public static void main(String[] args) {
            int[] number = {9, 6, 15, 10, 3, 17, 50, 10, 33, 18, 22};
            System.out.println(Sum.isDivisible(number));
        }

        public static int isDivisible(int[] numbers) {
            int total = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 3 == 0 && numbers[i] < 30) {
                    total += numbers[i];
                }
            }
            return total;
        }
    }
