package com.loicbaillif.bullsAndCows;

import com.loicbaillif.tools.Print;

import java.util.Objects;
import java.util.Scanner;

public class Stage6 {
    /* https://hyperskill.org/projects/53/stages/292/implement
     *
     * Stage 6/7 : New Level
     *
     * DESCRIPTION
     * Some players need a challenge, so let's make the secret code in the
     * game harder to guess. Add support for more than 10 symbols by adding
     * letters. Now, the secret code can contain the numbers 0-9 and the
     * lowercase Latin characters a-z. The new maximum length for the code
     * is 36. Note that the length of the secret word may not match the number
     * of possible characters in the secret code, so you should request input
     * twice: once for the secret code length and once for the number
     * of possible characters.
     *
     * Also, since a secret code is not a number anymore, the symbol 0 should
     * be allowed as the first character in a secret code.
     *
     * OBJECTIVES
     * In this step, your program should:
     *      1. Ask for the length of the secret code.
     *      2. Ask for the range of possible characters in the secret code.
     *      3. Generate a secret code using numbers and characters. This time,
     *      you should also print the secret code using * characters and print
     *      which characters were used to generate the secret code.
     *      4. Function as a fully playable game.
     *
     */

    // Static variables
    static boolean codeFound = false;
    static String codeAlphabet = "0123456789abcdefghijklmnopqrstuvwxyz";
    static String randomSeq = getRandomInt();
    static String requestCodeLength = "Input the length of the secret code:";
    static String requestCodeSymbols =
            "Input the number of possible symbols in the code";
    static String startGuessing = "Okay, let's start a game!";
    static String victory = "Congratulations! You guessed the secret code.";
    static int randomSeqLength = randomSeq.length();
    static int currentCodeSize = 0;
    static int currentTurn = 1;
    static int pointerPos = 0; // Pointer in randomSeq String
    static StringBuilder secretCode = new StringBuilder();



    public static void main() {
        Print.title("Stage 6: New Level", '+');

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

        String currentDigit = String.valueOf(randomSeq.charAt(pointerPos));

        while (secretCode.indexOf(currentDigit) != -1) {
            pointerPos++;
            if (pointerPos >= randomSeqLength) {
                randomSeq = getRandomInt();
                pointerPos = 0;
            }
            currentDigit = String.valueOf(randomSeq.charAt(pointerPos));
        }

        return currentDigit;
    }


    public static String getRandomInt() {
        // Generates a new pseudo-random int, 8 digits based on Math.random()
        return Integer.toString((int) (Math.random() * 100_000_000));
    }


    public static void getSecretCode(Scanner scanner) {
        // This method will generate a pseudo-random code, after asking
        // user/player to provide requested length (1 to 10)

        // Reset variables
        randomSeq = getRandomInt();
        secretCode = new StringBuilder();
        currentCodeSize = 0;

        System.out.println(requestCodeLength);
        int codeSize = scanner.nextInt();
        System.out.println(requestCodeSymbols);
        int codeSymbols = scanner.nextInt();


        if (codeSize > 36 || codeSize < 1) {
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
