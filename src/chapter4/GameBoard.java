package chapter4;

import java.util.Random;

public class GameBoard {

    public static void main (String args[]) {

        // Define the game board size and number of rolls
        final int TOTAL_SPACES = 20;
        final int TOTAL_ROLLS = 5;

        // Initialize the player's current position
        int currentPosition = 0;

        // Create a Random object to simulate die rolls
        Random random = new Random();

        // Loop through the number of rolls
        for (int roll = 1; roll <= TOTAL_ROLLS; roll++) {
            // Roll the die (generate a number between 1 and 6)
            int dieRoll = random.nextInt(6) + 1;

            // Advance the player's position
            currentPosition += dieRoll;

            // Check if the player has reached or exceeded the total spaces
            if (currentPosition == TOTAL_SPACES) {
                System.out.println("Roll " + roll + ": You rolled a " + dieRoll + ". You are now on space " + currentPosition + ".");
                System.out.println("Congratulations! You've won the game!");
                return;
            } else if (currentPosition > TOTAL_SPACES) {
                System.out.println("Roll " + roll + ": You rolled a " + dieRoll + ". You advanced to space " + currentPosition + " (which is beyond the limit).");
                System.out.println("Sorry, you've lost the game by exceeding the total number of spaces.");
                return;
            } else {
                // Inform the player of their current position and how many more spaces to go
                int spacesLeft = TOTAL_SPACES - currentPosition;
                System.out.println("Roll " + roll + ": You rolled a " + dieRoll + ". You are now on space " + currentPosition + ". " + spacesLeft + " more spaces to go.");
            }
        }

        // Check if the player has reached exactly 20 spaces after 5 rolls
        if (currentPosition == TOTAL_SPACES) {
            System.out.println("Congratulations! You've won the game!");
        } else {
            System.out.println("You ended on space " + currentPosition + ". You needed exactly " + TOTAL_SPACES + " to win.");
            System.out.println("Sorry, you lost the game.");
        }
    }
}
