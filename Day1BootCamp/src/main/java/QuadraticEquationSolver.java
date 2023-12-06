import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, and c
        System.out.print("Enter the value of coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant (delta)
        double delta = b * b - 4 * a * c;

        // Check if roots are real or complex
        if (delta >= 0) {
            // Calculate and display the roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Root 1 of x: " + root1);
            System.out.println("Root 2 of x: " + root2);
        } else {
            // Roots are complex
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(Math.abs(delta)) / (2 * a);

            System.out.println("Root 1 of x: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 of x: " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }
}
