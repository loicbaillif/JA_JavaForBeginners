package com.loicbaillif.bullsAndCows;

import com.loicbaillif.tools.Print;

import java.util.Objects;
import java.util.Scanner;

public class Stage7 {
    /* https://hyperskill.org/projects/53/stages/293/implement
     *
     * Stage 7/7 : Error!
     *
     * DESCRIPTION
     * There are a lot of error possibilities. What if someone enters an answer
     * of the wrong length? Or the number of possible symbols is less than the
     * length of the code? What if the answer contains invalid symbols?
     * The game may crash before the secret number was guessed!
     *
     * Let's handle errors like this. At this point, you can implement this
     * without the try catch construction. Use the following rule of thumb:
     * if you can avoid the exception-based logic, avoid it! If you use
     * exceptions in normal situations, how would you deal with unusual
     * (exceptional) situations? Now it may not seem that important, but when
     * you need to find errors in more complex programs,
     * this makes a difference.
     *
     * OBJECTIVES
     * In this stage, your program should:
     *      1. Handle incorrect input.
     *      2. Print an error message that contains the word error.
     *         After that, don't ask for the numbers again, just finish
     *         the program.
     *
     */

    // Static variables
    static boolean codeFound = false;
    static String codeAlphabet = "0123456789abcdefghijklmnopqrstuvwxyz";
    static String codePrepared = "The secred code is prepared: ";
    static String requestCodeLength = "Input the length of the secret code:";
    static String requestCodeSymbols =
            "Input the number of possible symbols in the code";
    static String startGuessing = "Okay, let's start a game!";
    static String victory = "Congratulations! You guessed the secret code.";
    static int currentCodeSize = 0;
    static int currentTurn = 1;
    static int symbolsRange = 0;
    static StringBuilder secretCode = new StringBuilder();



    public static void main() {
        Print.title("Stage 7: Error!", '+');

        Scanner scanner = new Scanner(System.in);

        if (getSecretCode(scanner)) {
            System.out.println("Valid code generated, continue"); //DEBUG
        } else {
            System.out.println("No valid code generated, the end"); //DEBUG
        }


        System.out.println(secretCode); // DEBUG
        System.out.println(codePrepared + hideCode());

        System.out.println(startGuessing);
        do {
            codeFound = playTurn();
        } while (!codeFound);
        System.out.println(victory);

        Print.subtitle("End of Stage 7", '+', (byte) 80);
    }


    public static String getDigit(int symbolsRange) {
        String newDigit;
        int indexInAlphabet;

        do {
            indexInAlphabet = (int) (Math.random() * symbolsRange);
            newDigit = String.valueOf(codeAlphabet.charAt(indexInAlphabet));
        } while (secretCode.indexOf(newDigit) != -1);

        return newDigit;
    }


    public static boolean getSecretCode(Scanner scanner) {
        // This method will generate a pseudo-random code, after asking
        // user/player to provide requested length (1 to 36)

        // Reset variables
        secretCode = new StringBuilder();
        currentCodeSize = 0;

        System.out.println(requestCodeLength);
        int codeSize = scanner.nextInt();
        System.out.println(requestCodeSymbols);
        symbolsRange = scanner.nextInt();


        if (codeSize > 36 || codeSize < 1 || codeSize > symbolsRange) {
            System.out.printf(
                    "Error: can't generate a secret number with a " +
                            "length of %d because there aren't enough unique digits.",
                    codeSize);
        } else {
            while (currentCodeSize < codeSize) {
                secretCode.append(getDigit(symbolsRange));
                currentCodeSize++;
            }
        }

        return true;
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


    public static String hideCode() {
        StringBuilder codeHidden = new StringBuilder();

        codeHidden.append("*".repeat(Math.max(0, currentCodeSize)));

        if (symbolsRange <= 10) {
            codeHidden.append(" (0-");
            codeHidden.append(symbolsRange - 1);
        } else {
            codeHidden.append(" (0-9, a");
            if (symbolsRange > 11) {
                codeHidden.append("-");
                codeHidden.append(codeAlphabet.charAt(symbolsRange - 1));
            }
        }

        codeHidden.append(").");

        return codeHidden.toString();
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
