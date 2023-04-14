package problemSolvingJava;

public class ValueOfPie{
    public static void main(String[] args) {
        valueOfPie2();
    }

    public static void valueOfPie2(){
        double divisor = 1;
        double newAnswer = 0.0;
        for (int i = 1; i < 2000000; i++){
            if( i % 2 == 0){
                newAnswer -= 4 / divisor;
                divisor += 2;
            }
            else {
                newAnswer += 4 / divisor;
                divisor += 2;
            }
            System.out.println(i + " " + newAnswer);
        }
    }
}