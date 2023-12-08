package QuizApplication;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {


//    public class QuizQuestion {
        private static final int TOTAL_QUESTIONS = 5;
        private static final int TIME_LIMIT_PER_QUESTION = 10;

        private static String[] questions = {
                "What is the capital of Nigeria?",
                "Which river is the longest in Nigeria?",
                "What is the largest ethnic group in Nigeria?",
                "Who is the first president of Nigeria?",
                "What is the currency used in Nigeria?"
        };

        private static String[][] options = {
                {"A) Abuja", "B) Lagos", "C) Kano", "D) Ibadan"},
                {"A) Niger River", "B) Benue River", "C) Chad River", "D) Ogun River"},
                {"A) Yoruba", "B) Igbo", "C) Hausa", "D) Fulani"},
                {"A) Nnamdi Azikiwe", "B) Olusegun Obasanjo", "C) Goodluck Jonathan", "D) Muhammadu Buhari"},
                {"A) Naira", "B) Cedi", "C) Rand", "D) Peso"}
        };

        private static char[] correctAnswers = {'A', 'B', 'C', 'A', 'A'};

        private static int score = 0;

        private static Timer timer;
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Welcome to the Quiz!\n");

            for (int i = 0; i < TOTAL_QUESTIONS; i++) {
                displayQuestion(i);

                waitForAnswer(i);
            }

            System.out.println("\nQuiz completed!");
            System.out.println("Your final score: " + score + "/" + TOTAL_QUESTIONS);

            if (timer != null) {
                timer.cancel();
            }
        }

        private static void displayQuestion(int questionIndex) {
            System.out.println("Question " + (questionIndex + 1) + ": " + questions[questionIndex]);
            for (String option : options[questionIndex]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
        }

        private static void waitForAnswer(int questionIndex) {
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("\nTime's up!");
                    displayCorrectAnswer(questionIndex);
                    moveToNextQuestion();
                }
            }, TIME_LIMIT_PER_QUESTION * 1000);

            String userAnswer = scanner.nextLine().trim(); // Trim to remove leading and trailing whitespaces

            if (userAnswer.isEmpty()) {
                System.out.println("You didn't provide an answer. Moving to the next question...\n");
                timer.cancel();
                return;
            }

            char userChoice = Character.toUpperCase(userAnswer.charAt(0));

            if (userChoice == correctAnswers[questionIndex]) {
                System.out.println("Correct!\n");
                score++;
            }
            else {
                System.out.println("Incorrect!\n");
                displayCorrectAnswer(questionIndex);
            }

            timer.cancel();
            moveToNextQuestion();
        }

        private static void displayCorrectAnswer(int questionIndex) {
            System.out.println("The correct answer is: " + correctAnswers[questionIndex]);
        }

        private static void moveToNextQuestion() {
            System.out.println("Moving to the next question...\n");
        }
    }

