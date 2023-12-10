public class PrintFunction {
    public void printTable(CourseInfo [] data) {
        System.out.println("\nBreakdown of Entries\n");
        System.out.println("|---------------|-------------|-------|------------|\n");
        System.out.printf("| %13s | %11s | %5s | %10s |\n", "COURSE & CODE", "COURSE UNIT", "GRADE", "GRADE-UNIT");
        System.out.println("|---------------|-------------|-------|------------|\n");
        for (CourseInfo course: data) {
            System.out.printf("| %-13s | %-11d | %-5s | %-10d |\n", course.getCourseCode(), course.getCourseUnit(), course.getGrade(), course.getGradeUnit());
        }
        System.out.println("|--------------------------------------------------|\n");
        AverageCalculator calculator = new AverageCalculator();
        System.out.printf("Your GPA = %.2f", calculator.averageFunction(data));
    }
}