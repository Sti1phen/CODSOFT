package StudentGradeCalculator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ConsolePrompt {
    static Scanner input = new Scanner(System.in);
    static String name;
    static int subjectNumber;
    public static String namePrompt(){
        Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z]+([.-]?[a-zA-Z]+)*$");
        System.out.println("\nWelcome to Student Grade Calculator!");
        System.out.print("Enter your name: ");
        name = input.next();

        while (true){
          if(name.isEmpty())
              System.out.print("Name field cannot be empty\nEnter a valid name: ");
          else if (NAME_PATTERN.matcher(name).matches())
              return name;
          else System.out.print("Enter a valid name: ");
          name = input.next();
          }
      }


    public static int subjectNumberPrompt(){
        System.out.print("Hi " + name + ". Enter the number of subject you took: ");

        while (true){
            try {
                subjectNumber = input.nextInt();
                if (subjectNumber < 0) {
                    System.out.println("Number of subject taken cannot " +
                            "be less than 0. Please enter a valid number");
                    subjectNumber = input.nextInt();
                    break;
                }
                break;
            }catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number: ");
                input.nextLine();
            }
        }
        return subjectNumber;
    }

    public static void readSubjectMark(){
        System.out.println("Enter the marks you obtained in each subject. " +
                "Press enter to move to your next input");
    }
}