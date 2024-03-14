import java.util.Random;
public class Homework12 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100_011 - 10) + 11;
        int sum = 0;
        int initialNumber = number;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Number: " + initialNumber);
        System.out.println("Summary of figures:  " + sum);
    }
}
