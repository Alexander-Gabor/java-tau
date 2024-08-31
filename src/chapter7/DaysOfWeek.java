package chapter7;

import java.util.Scanner;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args){
        //Step 1: Create an array that holds the days of the week
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //Step 2: Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        //Step 3: Prompt the user to input a number corresponding to the day of the week
        System.out.println("Enter a number (1-7) corresponding to the day of the week: ");
        int dayNumber = scanner.nextInt();

        //Step 4: Validate the input
        if (dayNumber < 1 || dayNumber > 7){
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        } else {
            // Step 5: Print the corresponding day of the week
            System.out.println("The day of the week is: " + daysOfWeek[dayNumber - 1]);
        }

        // Close the scanner
        scanner.close();
    }
}

