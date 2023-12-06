import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input seconds
        System.out.print("Enter seconds: ");
        int inputSeconds = scanner.nextInt();

        // Calculate hours, minutes, and remaining seconds
        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = inputSeconds % 60;

        // Print the result
        System.out.printf("%d seconds = %d Hours, %d minutes, and %d seconds\n", inputSeconds, hours, minutes, seconds);

        scanner.close();
    }
}
