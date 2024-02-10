import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a three-digit number
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        // Check if the entered number is a three-digit number
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid three-digit number.");
        } else {
            // Calculate the sum of digits
            int digit1 = number / 100; // Extract the hundreds place digit
            int digit2 = (number % 100) / 10; // Extract the tens place digit
            int digit3 = number % 10; // Extract the ones place digit
            int sum = digit1 + digit2 + digit3;

            // Display the result
            System.out.println("Sum of digits: " + sum);
        }

        scanner.close();
    }
}
