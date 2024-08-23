package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the plan fee
        System.out.print("Enter the base plan fee: $");
        double planFee = scanner.nextDouble();

        // Ask the user to input the number of overage minutes
        System.out.print("Enter the number of overage minutes: ");
        int overageMinutes = scanner.nextInt();

        // Calculate overage fees, tax, and final total
        double overageFees = calculateOverageFees(overageMinutes);
        double tax = calculateTax(planFee + overageFees);
        double finalTotal = calculateFinalTotal(planFee, overageFees, tax);

        // Print the itemized bill
        printBill(planFee, overageFees, tax, finalTotal);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate overage fees
    public static double calculateOverageFees(int overageMinutes) {
        final double OVERAGE_RATE = 0.25; // 25 cents per minute
        return overageMinutes * OVERAGE_RATE;
    }

    // Method to calculate tax
    public static double calculateTax(double subtotal) {
        final double TAX_RATE = 0.15; // 15% tax
        return subtotal * TAX_RATE;
    }

    // Method to calculate the final total
    public static double calculateFinalTotal(double planFee, double overageFees, double tax) {
        return planFee + overageFees + tax;
    }

    // Method to print the itemized bill
    public static void printBill(double planFee, double overageFees, double tax, double finalTotal) {
        System.out.println("\n--- Itemized Bill ---");
        System.out.printf("Plan Fee: $%.2f\n", planFee);
        System.out.printf("Overage Fees: $%.2f\n", overageFees);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Final Total: $%.2f\n", finalTotal);
    }
}
