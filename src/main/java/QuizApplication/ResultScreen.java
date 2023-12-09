package QuizApplication;

public class ResultScreen {

    public static void displayResult(){
        for (int questionIndex  = 0; questionIndex <QuizQuestions.TOTAL_QUESTIONS; questionIndex++){
            System.out.println("\nQuestion " + (questionIndex + 1) + ": " +
                    "" + QuizQuestions.questions[questionIndex]);
            System.out.println("Your answer: " + Timer.quizAnswers.get(questionIndex));

            if (Timer.quizAnswers.get(questionIndex) == QuizQuestions.correctAnswers[questionIndex]) {
                System.out.println("Correct!");
                Timer.score++;
            }
            else {
                System.out.println("Incorrect!");
                ConsoleDisplay.displayCorrectAnswer(questionIndex);
            }
        }
        System.out.println("\nYour final score: " + Timer.score + "/"
                + QuizQuestions.TOTAL_QUESTIONS);
    }
}
