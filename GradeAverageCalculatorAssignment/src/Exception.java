import java.util.Scanner;

public class Exception extends Throwable {
    public void Exception(Scanner input, CourseInfo course) {
        int score;
        while (true) {
            try {
                score = Integer.parseInt(input.next());
                if (score < 0) {
                    throw new java.lang.Exception();
                }
                course.setScore(score);
                break;
            } catch (java.lang.Exception ex) {
                System.out.print("Enter a score greater than zero: ");
            }
        }
    }
}
