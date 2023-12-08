package NumberGame;

import java.util.Scanner;

public class GamePrompt {
    static  String userMultipleRound;
    static String continueGame = "Y";
    static String endGame = "N";

    public static void gameRoundPrompt(){
        System.out.println("Round " + GameGuessComparator.numberOfRounds);
        System.out.print("Guess a number between 1 and 100: ");
    }

    public static String multipleRoundPrompt() {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to play again? Enter Y or N: ");
        userMultipleRound = input.nextLine();

        while (!(userMultipleRound.equalsIgnoreCase(continueGame) ||
                userMultipleRound.equalsIgnoreCase(endGame))){
            System.out.println("Invalid Input. \nPlease enter either Y or N:");
            userMultipleRound = input.next();
        }

        return userMultipleRound;
    }
}