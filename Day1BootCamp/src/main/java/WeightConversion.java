import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert pounds to kilograms
        double weightInKilograms = convertPoundsToKilograms(weightInPounds);

        // Print the result
        System.out.printf("%.2f pounds is equal to %.2f kilograms.%n", weightInPounds, weightInKilograms);

        scanner.close();
    }

    // Function to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
}
