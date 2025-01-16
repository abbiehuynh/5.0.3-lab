package academy.javapro.lab;

import java.util.Date;

public class OutputFormatting {
    public static void main(String[] args) {
        // Sample data
        String name = "Alice Johnson";
        int age = 28;
        double salary = 55000.75;
        Date currentDate = new Date();

        // 1. Use printf() to format and print a person's name in a field width of 20 characters, left-aligned.
        System.out.println("Name formatting:");

        // 2. Implement printf() to display an integer (age) in a field width of 5 characters, right-aligned.
        System.out.println("\n Age formatting:");

        // 3. Format a double value (salary) with 2 decimal places and thousands separator using printf().
        System.out.println("\n Salary formatting:");

        // 4. Use printf() to print the current date in the format: MM/dd/yyyy.
        System.out.println("\n Date formatting:");

        // 5. Create formatted strings using String.format() for combining name and age, and for representing salary as currency.
        System.out.println("\n Formatted strings:");

        // 6. Format and print a table of sample data for 3 people using printf() to align columns properly.
        System.out.println("\n Formatted table:");
    }
}
