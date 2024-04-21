
import java.util.Random;
import java.util.Scanner;

public class Number_game{
    public static void main(String[] args) {
        Random rand = new Random();
        int r1 = rand.nextInt(100);
        System.out.println("Enter your guess:");
        Scanner s = new Scanner(System.in);
        int flag = 0;
        while (flag == 0) {
            int a = s.nextInt();
            if (a < r1) {
                System.out.println("Too low");
            } else if (a == r1) {
                System.out.println("Correct!");
                flag = 1;
            } else {
                System.out.println("Too high");
            }
        }
    }
}
