package NumberGame;

public class Main {

    public static void main(String[] args) {
        do {
            GamePrompt.gameRoundPrompt();
            GameGuessComparator.guessComparator();
            GamePrompt.userMultipleRound =  GamePrompt.multipleRoundPrompt();

            if (GamePrompt.userMultipleRound.equalsIgnoreCase(GamePrompt.endGame)) {
                System.out.println("Game Ends");
                break;
            }

            ++GameGuessComparator.numberOfRounds;
        } while (GamePrompt.userMultipleRound.equalsIgnoreCase(GamePrompt.continueGame));

    }
}