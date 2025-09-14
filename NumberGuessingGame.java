import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100)+1;
        int attempts = 0;
        int maxAttempts= 6;
        boolean hasGuessed = false;

        System.out.println("Welcome to number guessing game !");
        System.out.println("pick a number between 1 to 100");
        System.out.println("Your Attempts :" +maxAttempts);
        //loop for user attempts
         while(attempts < maxAttempts){
             System.out.println(" Enter your guess:");
             if(!sc.hasNextInt()){
                 System.out.println("Invalid Input ! Please enter a number");
                 sc.next();
                 continue;
             }
             int userGuess = sc.nextInt();
             attempts++;

             if (userGuess == numberToGuess) {
                 System.out.println("Correct! you Guessed the correct number in " + attempts +"Attempts.");
                 hasGuessed = true;
                 break;
             }else if( userGuess < numberToGuess ){
                    System.out.println("Too low ! try again");
            }
             else{
                System.out.println("Too high ! try again");
                     }
             if(hasGuessed==false && attempts == 6){
                 System.out.println("U LOst! the number was: " +numberToGuess);
             }

                     //sc.close();
             }
         }
    }
