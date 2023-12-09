package QuizApplication;

public class
Main {

    public static void main(String[] args) {
            System.out.println("Welcome to the Quiz!\n");

            for (int questionNumber = 0; questionNumber < QuizQuestions.TOTAL_QUESTIONS; questionNumber++) {
                ConsoleDisplay.displayQuestion(questionNumber);

                Timer.answerTimer(questionNumber);

            }

            System.out.println("\nQuiz completed!");

            ResultScreen.displayResult();

    }

}

