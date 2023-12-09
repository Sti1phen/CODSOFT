package StudentGradeCalculator;

public class Main {
    public static void main(String[] args) {

        String name = ConsolePrompt.namePrompt();

        var gradeCalculator = new GradeCalculator();
        double markSum = gradeCalculator.getMarkSum();

        double averagePercentage = gradeCalculator.getAveragePercentage();
        String studentGrade = gradeCalculator.assignGrade((int)averagePercentage);

        var studentUser = new Student(name,studentGrade,averagePercentage,markSum);

        var printReport = new StudentReport(studentUser, gradeCalculator);
        printReport.printStudentResult();
    }
}