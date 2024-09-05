# Lab 5.0.3

**Learning Objectives**

- Understand the concept and importance of output formatting in Java development.
- Learn how to implement formatted output using `printf()` and `format()` methods.
- Explore practical applications of formatted output in real-world Java projects.
- Identify common pitfalls and best practices when working with output formatting.
- Gain hands-on experience with complete Java examples that demonstrate `printf()` and `format()` usage.

**Prerequisites**

- Basic understanding of Java programming.
- Familiarity with variables, data types, and basic control flow.
- Knowledge of how to run a Java program.

**What You'll Achieve**

By the end of this lab, you will have:

- Developed a solid understanding of output formatting in Java
- Implemented practical examples using `printf()` and `format()` methods
- Enhanced your skills in presenting data in a readable and organized manner
- Gained experience in formatting numbers, strings, and dates in Java
- Learned how to apply these concepts in real-world scenarios

**Assignment Details**

1. Use `printf()` to format and print a person's name in a field width of 20 characters, left-aligned.
2. Implement `printf()` to display an integer (age) in a field width of 5 characters, right-aligned.
3. Format a double value (salary) with 2 decimal places and thousands separator using `printf()`.
4. Use `printf()` to print the current date in the format: MM/dd/yyyy.
5. Create formatted strings using `String.format()` for combining name and age, and for representing salary as currency.
6. Format and print a table of sample data for 3 people using `printf()` to align columns properly.


**Example Output**

```
Name formatting:
Alice Johnson        

Age formatting:
   28

Salary formatting:
55,000.75

Date formatting:
09/05/2024

Formatted strings:
Name: Alice Johnson, Age: 28
$55,000.75

Formatted table:
Name                 Age    Salary
Alice Johnson         28 $55,000.75
Bob Smith             35 $62,500.50
Carol Davis           42 $78,900.25
```

**Starter Code**

```java
package academy.javapro.lab;

import java.util.Date;

public class OutputFormatting {
    public static void main(String[] args) {
        // Sample data
        String name = "Alice Johnson";
        int age = 28;
        double salary = 55000.75;
        Date currentDate = new Date();

        // TODO: Implement printf() and format() methods here
    }
}

```

**Hints**

- Use `%s` for strings, `%d` for integers, and `%f` for floating-point numbers in format specifiers.
- The `-` flag in format specifiers (e.g., `%-20s`) left-aligns the output.
- Use `,` flag (e.g., `%,f`) to add thousands separators to numbers.
- For date formatting, you can use `%tD` or create a custom format with `%tm`, `%td`, and `%tY`.
- When creating a table, calculate the width of each column based on the longest item in that column.

**Submission Instructions**

1. Fork the repository
2. Clone your fork
3. Navigate into the repository
4. Implement the required loops in the main method
5. Test your implementation with various inputs
6. Git add, commit, and push to your fork
7. Submit a pull request
    - Set the title of the pull request to your first name and last name
    - In the comment, briefly explain your implementation approach and any challenges you faced

Remember, the goal is to learn and have fun! Don't hesitate to ask for help if you get stuck.
