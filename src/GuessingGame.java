
import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {
    public void playGame() {
        int max = 100;
        int min = 1;
        int count = 5;

        int value = (int) (Math.random() * max) + min;
        Scanner input = new Scanner(System.in);
        boolean gameOver = true;

        while (count > 0) {
            System.out.print("enter your number: ");

            int guess = input.nextInt();
            if (guess == value) {
                System.out.println("You guessed the number...You win!");
                break;

            } else if (guess > value) {
                System.out.println("Your guess is too high. You have " + (count - 1) + " tries left.");
                count--;
            } else {
                System.out.println("Your guess is too low.You have " + (count - 1) + " tries left.");
            }
            count--;
        }
        if (gameOver == true) {
            System.out.println("GameOver!");
        }
    }
}