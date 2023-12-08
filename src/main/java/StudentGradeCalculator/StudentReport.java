package StudentGradeCalculator;

public class StudentReport {
    private final Student student;
    GradeCalculator gradeCalculator;

    public StudentReport(Student student, GradeCalculator gradeCalculator) {
        this.student = student;
        this.gradeCalculator = gradeCalculator;
    }

    public void printStudentResult(){
        System.out.println("\nHello "+ student.getName() + ". Here is your performance:");
        System.out.println("Total Mark: " + student.getMarkSum() + " out of " + gradeCalculator.getTotalObtainableMark());
        System.out.printf("Average Percentage: " + "%.2f\n", student.getAveragePercentage());
        System.out.println("Grade: " + student.getGrade());
        System.out.println();
    }
}