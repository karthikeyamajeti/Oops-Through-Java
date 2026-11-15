package UNIT0;
/*
WAP to generate a random number between 1 and 10 using seed 100.
Ask the user to guess it and display whether the guess is correct or wrong.
*/
import java.util.*;

public class RandomNumberGuessingGame {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generate random number between 1 and 10
        Random random = new Random(100);
        int num = random.nextInt(10) + 1;

        // Get user's guess
        int guess = sc.nextInt();

        // Check the guess
        if(guess == num){
            System.out.println("Congratulations! You guessed it right");
        }
        else {
            System.out.println("Wrong guess! The correct number was " + num);
        }
        
    }
}