import java.util.Scanner;

public class ComputeMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Physics marks (out of 100): ");
        double physicsMarks = scanner.nextDouble();

        System.out.print("Enter Chemistry marks (out of 100): ");
        double chemistryMarks = scanner.nextDouble();

        System.out.print("Enter Mathematics marks (out of 100): ");
        double mathMarks = scanner.nextDouble();

        // Compute total marks and percentages
        double totalMarks = physicsMarks + chemistryMarks + mathMarks;
        double physicsPercentage = (physicsMarks / 100) * 100;
        double chemistryPercentage = (chemistryMarks / 100) * 100;
        double mathPercentage = (mathMarks / 100) * 100;
        double totalPercentage = (totalMarks / 300) * 100;

        // Print the results
        System.out.printf("%s obtained following %% of marks in PCM:\n", studentName);
        System.out.printf("Physics: %.2f%%, Chemistry: %.2f%%, Maths: %.2f%%\n", physicsPercentage, chemistryPercentage, mathPercentage);
        System.out.printf("Total: %.2f%%\n", totalPercentage);

        scanner.close();
    }
}
