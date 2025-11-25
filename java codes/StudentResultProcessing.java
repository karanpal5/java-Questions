class InvalidMarksExeption extends Exception {
    public InvalidMarksExeption(String message) {
        super(message);
    }
}
public class StudentResultProcessing {
    public static void  calculateGrade(int marks) throws InvalidMarksExeption {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksExeption("Marks should be between 0 and 100.");
        }
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

}