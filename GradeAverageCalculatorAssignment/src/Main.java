import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input;
        int index = 0, unit = 0, score = 0, noOfCourses;
        System.out.print("How many courses did you take? ");
        input = new Scanner(System.in);

        while (true) {
            try {
                noOfCourses = input.nextInt();
                if (noOfCourses < 0) {
                    System.out.print("Enter a value greater than 0: ");
                } else if (noOfCourses == 0) {
                    System.out.println("Thank you for using this app!");
                    System.exit(0);
                } else {
                    break;
                }
            } catch (InputMismatchException ex) {
                System.out.print("Invalid input. Please enter an integer: ");
                input.next();
            }
        }

        CourseInfo[] data = new CourseInfo[noOfCourses];

        try {
            while (index < noOfCourses) {
                CourseInfo course = new CourseInfo();
                input = new Scanner(System.in);
                System.out.printf("Entry: %d\nEnter the course %d code: ", index + 1, index + 1);
                course.setCourseCode(input.nextLine());
                System.out.print("Enter the course unit (positive integers only): ");

                while (true) {
                    try {
                        input = new Scanner(System.in);
                        unit = input.nextInt();
                        if (unit < 0) {
                            System.out.print("Enter a value greater than 0: ");
                        } else {
                            course.setCourseUnit(unit);
                            break;
                        }
                    } catch (InputMismatchException ex) {
                        System.out.print("Invalid input. Please enter a valid integer for course unit: ");
                        input.next();
                    }
                }

                while (true) {
                    try {
                        input = new Scanner(System.in);
                        System.out.print("Enter your score: ");
                        score = input.nextInt();
                        if (score < 0 || score > 100) {
                            System.out.print("Enter a value greater than or equal to 0 and less than 100: ");
                        } else {
                            course.setScore(score);
                            break;
                        }
                    } catch (InputMismatchException ex) {
                        System.out.println("Invalid input. Please enter a valid integer for score.");
                        input.next();
                    }
                }
                data[index] = course;
                index++;
            }
        } catch (InputMismatchException ex) {
            System.out.println("You have entered a non-integer value. Please re-enter details for the course.");
        }
        PrintFunction print = new PrintFunction();
        print.printTable(data);
    }
}
