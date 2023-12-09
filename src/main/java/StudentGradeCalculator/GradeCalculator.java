package StudentGradeCalculator;

import java.util.Scanner;

public class GradeCalculator {
    double markSum = 0;
    int subjectNumber;
    private static final int MAX_SUBJECT_MARK = 100;
    Scanner input = new Scanner(System.in);

    public double getMarkSum(){
        subjectNumber = ConsolePrompt.subjectNumberPrompt();
        double subjectMark;
        ConsolePrompt.readSubjectMark();

        for (int i = 1; i <= subjectNumber; i++) {
        while (true){
            try {
                subjectMark = input.nextInt();
                if (subjectMark < 0 || subjectMark > 100) {
                    System.out.println("Error. Subject Marks is from 0 - 100");
                    subjectMark= input.nextDouble();
                    break;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter values between 0 and 100");
                input.nextLine();
            }
        }
            markSum += subjectMark;
        }
        return markSum;
    }

    public int getTotalObtainableMark(){
        return subjectNumber * MAX_SUBJECT_MARK;
    }

    public double getAveragePercentage(){
       return  markSum / subjectNumber;
    }

    public String assignGrade(int averagePercent){
        String studentGrade;
        switch ((int) getAveragePercentage()/10) {
            case 9, 10 -> studentGrade = "A";
            case 8 -> studentGrade = "B";
            case 7 -> studentGrade = "C";
            case 6 -> studentGrade = "D";
            case 5 -> studentGrade = "E";
            default -> studentGrade = "F";
        }
        return studentGrade;
    }
}