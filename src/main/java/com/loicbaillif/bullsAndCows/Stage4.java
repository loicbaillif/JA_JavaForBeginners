package com.loicbaillif.bullsAndCows;

import com.loicbaillif.tools.Print;

import java.util.Objects;
import java.util.Scanner;

public class Stage4 {
    /* https://hyperskill.org/projects/53/stages/290/implement
     *
     * Stage 4/7 : Game time!
     *
     * In this stage, you should combine all the previous parts into a simple
     * playable version of the "Bulls and Cows" game. First, prompt the player
     * to input the length of the secret code. The length will determine the
     * difficulty level for the current game session. The program should
     * generate a secret code of the given length. Remember that it should
     * consist of unique numbers.
     *
     * Then, the game starts and the program prompts the player to guess
     * the code. When the player inputs a number, the program should grade it
     * in bulls and cows. The game goes on until the code is guessed, that is,
     * until the number of bulls is equal to the number of digits in the code.
     * When the game ends, the program should finish its execution.
     */

    // Static variables
    static boolean codeFound = false;
    static String nanoTime = getNewNano();
    static String startGuessing = "Okay, let's start a game!";
    static int nanoTimeLength = nanoTime.length();
    static int currentCodeSize = 0;
    static int currentTurn = 1;
    static int pointerPos = 0; // Pointer in nanoTime String
    static StringBuilder secretCode = new StringBuilder();



    public static void main() {
        Print.title("Stage 4: Game Time", '+');

        Scanner scanner = new Scanner(System.in);

        getSecretCode(scanner);
        System.out.println(secretCode); // DEBUG
        System.out.println(startGuessing);
        do {
            codeFound = playTurn();
        } while (!codeFound);


        Print.subtitle("End of Stage 4", '+', (byte) 80);
    }


    public static void printGrade(byte[] result) {
        if (result[0] != 0 && result[1] != 0) {
            System.out.printf(
                    "Grade: %d bull(s) and %d cow(s).",
                    result[0],
                    result[1]);
        } else if (result[0] == 0 && result[1] == 0) {
            System.out.println("Grade: None.");
        } else if (result[0] == 0) {
            System.out.printf("Grade: %d cow(s).", result[1]);
        } else {
            System.out.printf("Grade: %d bull(s).", result[0]);
        }
    }


    public static String getDigit() {

        if (currentCodeSize == 0) {
            // First digit cannot be a 0
            while (nanoTime.charAt(pointerPos) == '0') {
                pointerPos++;
            }
        }

        String currentDigit = String.valueOf(nanoTime.charAt(pointerPos));

        while (secretCode.indexOf(currentDigit) != -1) {
            pointerPos++;
            if (pointerPos >= nanoTimeLength) {
                nanoTime = getNewNano();
                pointerPos = 0;
            }
            currentDigit = String.valueOf(nanoTime.charAt(pointerPos));
        }

        return currentDigit;
    }


    public static String getNewNano() {
        // Generates a new pseudo-random int, based on nanoTime
        StringBuilder sb1 = new StringBuilder();
        sb1.append(System.nanoTime()).reverse();
        return sb1.toString();
    }


    public static void getSecretCode(Scanner scanner) {
        // This method will generate a pseudo-random code, after asking
        // user/player to provide requested length (1 to 10)

        // Reset variables
        nanoTime = getNewNano();
        secretCode = new StringBuilder();
        currentCodeSize = 0;

        System.out.println("Please, enter the secret code's length:");

        int codeSize = scanner.nextInt();
        if (codeSize > 10 || codeSize < 1) {
            System.out.printf(
                    "Error: can't generate a secret number with a " +
                            "length of %d because there aren't enough unique digits.",
                    codeSize);
        } else {
            while (currentCodeSize < codeSize) {
                secretCode.append(getDigit());
                currentCodeSize++;
            }
        }
    }


    public static byte[] gradeNumber(String proposal, String solution) {
        byte nbBulls = 0;
        byte nbCows = 0;

        for (byte i = 0; i < proposal.length(); i++) {
            if (Objects.equals(proposal.charAt(i), solution.charAt(i))) {
                nbBulls++;
            } else if (solution.indexOf(proposal.charAt(i)) != -1) {
                nbCows++;
            }
        }

        return new byte[]{nbBulls, nbCows};
    }


    public static boolean playTurn() {
        System.out.printf("Turn %d:%n", currentTurn);
        Scanner scanner2 = new Scanner(System.in);
        String userInput = scanner2.nextLine();

        System.out.println(userInput);
        byte[] result = gradeNumber(userInput, secretCode.toString());
        printGrade(result);
        currentTurn++;

        return result[0] == currentCodeSize;
    }

}
