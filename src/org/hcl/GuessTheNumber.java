package org.hcl;
import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {
    private int generatedNumber;
    private int attempts;
    private int score;

    public GuessTheNumber() {
        Random random = new Random();
        generatedNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        attempts = 0;
        score = 0;
    }

    public void play() {
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have generated a number between 1 and 100.");
        System.out.println("Try to guess the number within 10 attempts.");

        Scanner scanner = new Scanner(System.in);

        while (attempts < 10) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < generatedNumber) {
                System.out.println("Your guess is lower than the generated number.");
            } else if (guess > generatedNumber) {
                System.out.println("Your guess is higher than the generated number.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
                calculateScore();
                break;
            }
        }

        if (attempts >= 10) {
            System.out.println("Sorry, you have exceeded the maximum number of attempts.");
        }

        displayScore();
    }

    private void calculateScore() {
        score = 10 - attempts;
    }

    private void displayScore() {
        System.out.println("Score: " + score);
    }
}





