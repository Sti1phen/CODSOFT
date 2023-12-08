package StudentGradeCalculator;

public class Student {
    private final String name;
    private final String grade;
    private final double averagePercentage;
    private final double totalMark;

    public Student(String name, String grade, double averagePercentage, double totalMark) {
        this.name = name;
        this.grade = grade;
        this.averagePercentage = averagePercentage;
        this.totalMark = totalMark;
    }

    public String getGrade() {
        return grade;
    }

    public double getAveragePercentage() {
        return averagePercentage;
    }

    public double getMarkSum() {
        return totalMark;
    }

    public String getName() {
        return name;
    }
}