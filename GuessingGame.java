import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        int targetNumber = randomGenerator.nextInt(150) + 1;  // Range changed to 1-150
        System.out.println("===== Welcome to the Guessing Game! =====");
        System.out.println("The computer has chosen a number between 1 and 150.");
        System.out.println("You have up to 8 attempts to guess the correct number, or the computer wins.");
        System.out.println("If you guess correctly, the game ends with a victory message.");

        for (int attempt = 1; attempt <= 8; attempt++) {  // Reduced attempts to 8
            System.out.print("Attempt #" + attempt + " - Enter your guess: ");
            int playerGuess = scanner.nextInt();

            if (playerGuess == targetNumber) {
                System.out.println("Amazing! You guessed the number!");
                System.out.println("Congratulations, YOU WON the game!");
                break;
            } else if (playerGuess > targetNumber) {
                System.out.println("Too high! Try a lower number.");
            } else {
                System.out.println("Too low! Try a higher number.");
            }

            if (attempt == 8) {
                System.out.println("Out of attempts! The game is over.");
                System.out.println("The correct number was: " + targetNumber);
            }
        }
    }
}
