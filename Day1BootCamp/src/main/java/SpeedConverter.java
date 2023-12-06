import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter the speed: ");
        double speed = scanner.nextDouble();

        // Ask the user for the choice of conversion
        System.out.print("Choose conversion (1 for km/h to m/s, 2 for m/s to km/h): ");
        int choice = scanner.nextInt();

        // Perform the conversion based on user choice
        double convertedSpeed = 0.0;
        switch (choice) {
            case 1:
                convertedSpeed = kmPerHourToMeterPerSecond(speed);
                System.out.println(speed + " km/h is equal to " + convertedSpeed + " m/s");
                break;
            case 2:
                convertedSpeed = meterPerSecondToKmPerHour(speed);
                System.out.println(speed + " m/s is equal to " + convertedSpeed + " km/h");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        scanner.close();
    }

    // Function to convert speed from km/h to m/s
    public static double kmPerHourToMeterPerSecond(double kmPerHour) {
        return kmPerHour * 1000 / 3600;
    }

    // Function to convert speed from m/s to km/h
    public static double meterPerSecondToKmPerHour(double meterPerSecond) {
        return meterPerSecond * 3600 / 1000;
    }
}
