package NumberGame;

import java.util.Scanner;

public class GameGuessComparator {
    private static final int MAX_TRIAL_COUNT = 5;
    public static int numberOfRounds = 1;

    public static void guessComparator() {
        Scanner input = new Scanner(System.in);
        int randomGuess = RandomNumberGenerator.randomGuess();
        int roundScore = 5;
        int number;

        for (int trialCount = 1; trialCount <= MAX_TRIAL_COUNT; ++trialCount) {
            try {
                 number = input.nextInt();

            }catch (Exception e) {
                System.out.println("Your entry is incorrect. " +
                        "Enter a whole number between 1 to 100 inclusive: ");
                input.nextLine();
                continue;
            }

            if (number < 1 || number > 100)
                System.out.println("Invalid Input. Number must be between 1 and 100.");

            else if (number < randomGuess) {
                if ((number + 5) > randomGuess)
                    System.out.println("Low.\nTry again: ");
                else
                    System.out.println("Too low.\nTry again: ");
                roundScore -= 1;
            }

            else if (number > randomGuess) {
                if ((number - 5) < randomGuess)
                    System.out.println("High.\nTry again: ");
                else
                    System.out.println("Too high.\nTry again: ");
                roundScore -= 1;
            } else {
                    System.out.println("Correct!");
                    roundScore *= 2;
                    break;
            }
        }

        System.out.println("Round " + numberOfRounds + " ends.");
        System.out.println("The correct guess is " + randomGuess);
        System.out.println("Your score is " + roundScore + "\n");
        input.nextLine();
    }
}