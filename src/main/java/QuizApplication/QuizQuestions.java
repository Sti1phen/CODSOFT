package QuizApplication;

public class QuizQuestions {

    public static final int TOTAL_QUESTIONS = 5;
    public static String[] questions = {
            "What is the capital of Nigeria?",
            "Which river is the longest in Nigeria?",
            "What is the largest ethnic group in Nigeria?",
            "Who is the first president of Nigeria?",
            "What is the currency used in Nigeria?"
    };
    public static String[][] options = {
            {"A) Abuja", "B) Lagos", "C) Kano", "D) Ibadan"},
            {"A) Niger River", "B) Benue River", "C) Chad River", "D) Ogun River"},
            {"A) Yoruba", "B) Igbo", "C) Hausa", "D) Fulani"},
            {"A) Nnamdi Azikiwe", "B) Olusegun Obasanjo", "C) Goodluck Jonathan", "D) Muhammadu Buhari"},
            {"A) Naira", "B) Cedi", "C) Rand", "D) Peso"}
    };
    public static char[] correctAnswers = {'A', 'B', 'C', 'A', 'A'};
}
