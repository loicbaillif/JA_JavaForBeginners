package com.loicbaillif.bullsAndCows;

import com.loicbaillif.tools.Print;

import java.util.Objects;
import java.util.Scanner;

public class Stage5 {
    /* https://hyperskill.org/projects/53/stages/291/implement
     *
     * Stage 5/7 : Improve the code generator
     *
     * DESCRIPTION
     * The algorithm suggested for generating the secret code in the previous
     * stage was really a “reinvention of the wheel”. Java already has the
     * tools for generating random numbers! Research some common pseudo-random
     * generation methods such as Math.random() and other methods from the
     * Random class. Choose the method you like and use it to rewrite the
     * secret code generation.
     * Nothing else is supposed to change at this stage: the program asks for
     * the length, generates a secret code, and then receives and grades the
     * attempts until the code is guessed. Your task here is to rewrite the
     * code generator without breaking the existing code.
     *
     * OBJECTIVE
     * In this stage, rewrite the secret code generator using a suitable Java method.
     */

    // Static variables
    static boolean codeFound = false;
    static String nanoTime = getNewNano();
    static String randomSeq;
    static String startGuessing = "Okay, let's start a game!";
    static String victory = "Congratulations! You guessed the secret code.";
    static int nanoTimeLength = nanoTime.length();
    static int currentCodeSize = 0;
    static int currentTurn = 1;
    static int pointerPos = 0; // Pointer in nanoTime String
    static StringBuilder secretCode = new StringBuilder();



    public static void main() {
        Print.title("Stage 4: Game Time", '+');

        Scanner scanner = new Scanner(System.in);

        getSecretCode(scanner);
        // System.out.println(secretCode); // DEBUG
        System.out.println(startGuessing);
        do {
            codeFound = playTurn();
        } while (!codeFound);
        System.out.println(victory);


        Print.subtitle("End of Stage 4", '+', (byte) 80);
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

    public static String getRandomInt() {
        // Generates a new pseudo-random int, 8 digits based on Math.random()
        return Integer.toString((int) (Math.random() * 100_000_000));
    }


    public static void getSecretCode(Scanner scanner) {
        // This method will generate a pseudo-random code, after asking
        // user/player to provide requested length (1 to 10)

        // Reset variables
        nanoTime = getNewNano();
        randomSeq = getRandomInt();
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


    public static void printGrade(byte[] result) {
        if (result[0] != 0 && result[1] != 0) {
            System.out.printf(
                    "Grade: %d %s and %d %s.%n",
                    result[0],
                    result[0] > 1 ? "bulls" : "bull",
                    result[1],
                    result[1] > 1 ? "cows" : "cow");
        } else if (result[0] == 0 && result[1] == 0) {
            System.out.println("Grade: None.");
        } else if (result[0] == 0) {
            System.out.printf(
                    "Grade: %d %s.%n",
                    result[1],
                    result[1] > 1 ? "cows" : "cow");
        } else {
            System.out.printf(
                    "Grade: %d %s.%n",
                    result[0],
                    result[0] > 1 ? "bulls" : "bull");
        }
    }

}
