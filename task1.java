import java.util.Random;
import java.util.Scanner;


public class task1{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        int minRange =1;
        int maxRange=100;
        int maxAttempts =5;
        int Score= 0;

        boolean playAgain=true;

        while(playAgain){
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts=0;

            System.out.println("welcome to the number guessing game");
            System.out.println("try to guess the number between " + minRange + "and " + maxRange + ".");

        while(attempts < maxAttempts){
                System.out.println("attempt " +(attempts + 1) + " enter your guess:" );
                int userguess = scanner.nextInt();

                if (userguess < minRange || userguess>maxRange){
                    System.out.println("please enter a valid number within the specified range");
                }else {
                    attempts++;

                if(userguess == randomNumber){
                        System.out.println("congratulations.. you have guess the correct number in " + attempts + "attempts.");
                        Score++;
                        break;
                    }
                else if (userguess<randomNumber){
                        System.out.println("Too low. try again");
                    }
                else {
                        System.out.println("Too high. try again");
                    }
                }
            }

if (attempts == maxAttempts){
    System.out.println("Sorry. you've used all attempts. the correct number was " + randomNumber + ".");
}
System.out.println("do you want play again ? (yes/no)");
String playAgainInput = scanner.next();
playAgain = playAgainInput.equalsIgnoreCase("yes");

 }

System.out.println("your final score is " + Score +"round won");

    }
}