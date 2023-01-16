package chapterTwo;

public class project{
    static int minimumNumber = 0;
    static int maximumNumber = 1;

    public static void main(String[] args) {

        for (int counter = 0; counter <= 10; counter++) {
            if (maximumNumber < counter) {
                maximumNumber = counter;

                if (minimumNumber > counter){
                    minimumNumber = counter;
                }

                }

            }
        System.out.println(minimumNumber);
        System.out.println(maximumNumber);
        }
    }
