import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class random_num_guesser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class random_num_guesser
{public static void main(String[]args){
    Random rand = new Random();
    Scanner randNum = new Scanner(System.in);
    //generate random integers between 0~9
    int number = rand.nextInt(10);
    int count = 5;
    int guess;
    System.out.println("I generated a random number between 0~9.Try to guess it!");
    while(count>0){
        System.out.println("Enter a number between 0~9 to guess.");
        guess = randNum.nextInt();
        if (guess == number){
         System.out.println("Congratulations! You guessed right!");   
            count = 0;
        }
        else if (guess > number){
           System.out.println("Ooops! You guessed too high. Try again.");
        }
        else{
            System.out.println("Ooops! Too low. Try again.");
        }
        count = count-1;
    }
        if (count == 0){
            System.out.println("     GAME OVER");
            System.out.println("You ran out of guesses.");
            randNum.close();
        }
    
    
    
    
}
    
}
