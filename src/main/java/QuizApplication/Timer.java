package QuizApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.regex.Pattern;

public class Timer {

    public static final int TIME_LIMIT_PER_QUESTION = 10;
    public static int score = 0;

    public static java.util.Timer timer;
    public static Scanner scanner = new Scanner(System.in);
    static List<Character> quizAnswers =new ArrayList<>();
    static Pattern QUIZ_ANSWER =  Pattern.compile("^([a-dA-D])$");

    public static void answerTimer(int questionNumber) {
        char userChoice;
        timer = new java.util.Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\nTime's up!");
                System.out.println("You didn't provide an answer. Moving to the next question...\n");
                timer.cancel();
                ConsoleDisplay.nextQuestion(questionNumber);

            }
        }, TIME_LIMIT_PER_QUESTION * 1000);

        String userAnswer = scanner.nextLine().trim();
        if (userAnswer.isEmpty())
            userAnswer = " ";

        while (true){
            if (QUIZ_ANSWER.matcher(userAnswer).matches()) {
                break;
            }
            else
                System.out.print("Enter a valid option: ");

            userAnswer = scanner.nextLine().trim();
        }
        userChoice = Character.toUpperCase(userAnswer.charAt(0));
        quizAnswers.add(userChoice);

        timer.cancel();
    }
}