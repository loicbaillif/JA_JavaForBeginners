package com.loicbaillif.bullsAndCows;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Stage4 {
    /* https://hyperskill.org/projects/53/stages/290/
     *
     * Stage 4/7: Game Time
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

    // Variables
    static String nanoTime = genNewNano();
    static int nanoTimeLength = nanoTime.length();
    static int currentCodeSize = 0;
    static int pointerPos = 0; // Pointer in nanoTime String
    static StringBuilder secretCode = new StringBuilder();


    public static void main() {
        Print.title("Stage 4/7 : Game Time");

        Scanner scanner = new Scanner(System.in);
        String secretCode = getRandom(scanner);

        Print.subtitle("End of Exercise");
    }


    public static String getRandom(Scanner scanner) {
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

        return secretCode.toString();
    }


    public static String genNewNano() {
        StringBuilder sb1 = new StringBuilder();
        sb1.append(System.nanoTime()).reverse();
        return sb1.toString();
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
                nanoTime = genNewNano();
                pointerPos = 0;
            }
            currentDigit = String.valueOf(nanoTime.charAt(pointerPos));
        }

        return currentDigit;
    }
}
