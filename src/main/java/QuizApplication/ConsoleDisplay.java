package QuizApplication;

public class ConsoleDisplay {

    public static void displayQuestion(int questionIndex) {
        System.out.println("Question " + (questionIndex + 1) + ": " +
                "" + QuizQuestions.questions[questionIndex]);
        for (String option : QuizQuestions.options[questionIndex]) {
            System.out.println(option);
        }
        System.out.print("Your answer: ");
    }
    public static int nextQuestion(int currentQuestionNumber){
            currentQuestionNumber++;
            return currentQuestionNumber;
//            if (currentQuestionNumber < QuizQuestions.TOTAL_QUESTIONS) {
//                displayQuestion(currentQuestionNumber);
//            }
        }

    public static void displayCorrectAnswer(int questionIndex) {
        System.out.println("The correct answer is: " + QuizQuestions.correctAnswers[questionIndex]);
    }

}
