/*
 *  Assignment Lab 5
 *  Description: Process Fibonacci based on input and print list from it.
 *  Name: Rick
 *  Semester: Fall 2021
 */

// Import Scanner package
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        // Declare variable for "count"
        int count = 2;

        // Creating object for input.
        Scanner input = new Scanner(System.in);

        // Print text asking for number of Fibonacci numbers.
        System.out.print("Please enter number between 1 to 20 you want for the Fibonacci series: ");

        // Assign input to "number" variable
        int number = input.nextInt();
        System.out.println();

        // Sample Fibonacci : 0 1 1 2 3 5 8 13 21 34

        // Check if "number" is 0 or below 0
        if(number < count) {
            if (number == 0 || number < 0) {
                System.out.print("You chose to view nothing for series. Please enter a number between 1 to 20.");
            }
        }

        // Check if number falls within input range, 1 to 20.

        if (number >= 1 && number <= 20) {

            System.out.println("Fibonacci series is :");
            System.out.println();
            // Print initial numbers in Fibonacci list
            int firstNumber = 0;
            System.out.print(firstNumber + " ");
            int secondNumber = 1;

            // Check if user entered 1, if they did, then don't print second number
            if (number != 1)
                System.out.print(secondNumber + " ");

            // Set while loop condition to continue when "count" is less than "number"
            while (count < number) {

                // Assign first and second value to "current"
                int current = firstNumber + secondNumber;

                // Print "current" value
                System.out.print(current + " ");

                // Copy second var to first var
                firstNumber = secondNumber;

                // Copy "current" value to second value var
                secondNumber = current;

                // Iterate "count"
                count++;
            }

        } else if(number > 20)
            System.out.print("Please enter a number less than 20.");
    }
}

