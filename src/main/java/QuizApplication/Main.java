package QuizApplication;

public class Main {

    public static void main(String[] args) {
            System.out.println("Welcome to the Quiz!\n");

            for (int i = 0; i < QuizQuestions.TOTAL_QUESTIONS; i++) {
                ConsoleDisplay.displayQuestion(i);

                Timer.waitForAnswer();

            }

            System.out.println("\nQuiz completed!");

            ResultScreen.displayResult();

    }

}

