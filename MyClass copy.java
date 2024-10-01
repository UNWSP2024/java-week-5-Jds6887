package myproject;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Input Handling
        System.out.print("Enter a number between 3 and 20: ");
        int n = scanner.nextInt();
        
        // Validate input
        if (n < 3 || n > 20) {
            System.out.println("Number must be between 3 and 20.");
            return;
        }

        // Step 2: Print Table Header
        System.out.print("+");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i); // Formatting for alignment
        }
        System.out.println();

        // Step 3: Nested Loop for Table Generation
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d|", i); // Start of each row
            
            for (int j = 1; j <= n; j++) {
                int sum = i + j; // Calculate sum
                System.out.printf("%4d", sum); // Print sum with formatting
            }
            System.out.println(); // Move to next line after each row
        }

        scanner.close();
    }
}
    
    