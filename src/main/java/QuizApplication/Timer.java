package QuizApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TimerTask;

public class Timer {

    public static final int TIME_LIMIT_PER_QUESTION = 10;
    public static int score = 0;
    public static java.util.Timer timer;
    public static Scanner scanner = new Scanner(System.in);
    private static List<Character> quizAnswers =new ArrayList<>();

    public static void waitForAnswer(int questionIndex) {

        timer = new java.util.Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\nTime's up!");
                System.out.println("You didn't provide an answer. Moving to the next question...\n");

                timer.cancel();

            }
        }, TIME_LIMIT_PER_QUESTION * 1000);

        String userAnswer = scanner.nextLine().trim();

        if (userAnswer.isEmpty())
            userAnswer = " ";
        char userChoice = Character.toUpperCase(userAnswer.charAt(0));
        quizAnswers.add(userChoice);

        timer.cancel();

    }

    public static void displayResult(){
        for (int questionIndex  = 0; questionIndex <QuizQuestions.TOTAL_QUESTIONS; questionIndex++){
            System.out.println("Question " + (questionIndex + 1) + ": " +
                    "" + QuizQuestions.questions[questionIndex]);
            System.out.println("Your answer: " + quizAnswers.get(questionIndex));

            if (quizAnswers.get(questionIndex) == QuizQuestions.correctAnswers[questionIndex]) {
                System.out.println("Correct!\n");
                score++;
            }
            else {
                System.out.println("Incorrect!\n");
                Main.displayCorrectAnswer(questionIndex);
            }
        }
        System.out.println("Your final score: " + QuizApplication.Timer.score + "/"
                + QuizQuestions.TOTAL_QUESTIONS);
    }

}