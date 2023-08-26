import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");
        
        int score = 0;
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;
            
            if (userGuess < numberToGuess)
            {
                System.out.println("Your guess is too low. Try again.");
                score -= 10;
            }
            else if(userGuess > numberToGuess) 
            {
                System.out.println("Your guess is too high. Try again.");
                score -= 10;
            }
            else
            {
                hasGuessedCorrectly = true;
                score += 100;
                if(score>30)
                System.out.println("Congratulations! You've guessed the number " + numberToGuess);
                else
                System.out.println("Sorry! Your score is too low.. Better Luck Next Time");
                System.out.println("Wrong Tries ::" + numberOfTries);
                System.out.println("Your Score ::" + score);
            }
        }
        scanner.close();
    }
}