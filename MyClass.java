package mypackage;

import java.util.Random;
import java.util.Scanner;

public class MyClass{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String continueRolling;

        do {
            // Generate random numbers for two dice (1-6)
            int die1 = random.nextInt(6) + 1; // Generates a number between 1 and 6
            int die2 = random.nextInt(6) + 1; // Generates a number between 1 and 6
            int sum = die1 + die2; // Calculate the sum

            // Display results
            System.out.println("You rolled: " + die1 + " and " + die2);
            System.out.println("Sum: " + sum);

            // Ask user if they want to roll again
            System.out.print("Do you want to roll again? (yes/no): ");
            continueRolling = scanner.nextLine().trim().toLowerCase();

        } while (continueRolling.equals("yes"));

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}