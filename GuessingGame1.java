import java.util.Scanner;
import java.util.Random;
public class GuessingGame1 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        
        //computer generates a random number between 1 and 100
        int numberToGuess = rm.nextInt(100)+1;
        int userGuess = 0;
        int attempts = 0;
        
        System.out.println("welcome to the Guessing game!");
        System.out.println("I have picked a number between 1 and 100.try to guess it!");
        
        //loop until the user guesses the correct number
        while(userGuess != numberToGuess)
        {
            System.out.print("Enter your guess:");
            userGuess = sc.nextInt();
            attempts++;
        
            //check if the guess is to high, too low, or current
            if(userGuess > numberToGuess)
            {
                System.out.println("Too high! Try again.");
            }
            else if(userGuess < numberToGuess)
            {
                System.out.println("Too low! Try again.");
            }
            else
            {
                System.out.println("Congratulations you have guessed the correct number.");
                System.out.println("It took you"+ attempts +"attempts.");
            }
        }
    
        //close the Scanner
        sc.close();
    }
}
