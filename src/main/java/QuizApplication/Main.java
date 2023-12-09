package QuizApplication;

public class Main {

    public static void main(String[] args) {
            System.out.println("Welcome to the Quiz!\n");

            for (int i = 0; i < QuizQuestions.TOTAL_QUESTIONS; i++) {
                displayQuestion(i);

                Timer.waitForAnswer(i);

            }

            System.out.println("\nQuiz completed!");

        Timer.displayResult();


    }

        public static void displayQuestion(int questionIndex) {
            System.out.println("Question " + (questionIndex + 1) + ": " +
                    "" + QuizQuestions.questions[questionIndex]);
            for (String option : QuizQuestions.options[questionIndex]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
        }

    public static void displayCorrectAnswer(int questionIndex) {
            System.out.println("The correct answer is: " + QuizQuestions.correctAnswers[questionIndex]);
        }

        public static void moveToNextQuestion() {
            System.out.println("Moving to the next question...\n");
        }
    }

