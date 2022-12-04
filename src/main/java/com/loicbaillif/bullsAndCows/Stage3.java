package com.loicbaillif.bullsAndCows;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Stage3 {
    /* https://hyperskill.org/projects/53/stages/289/
     *
     * Stage 3 / 7 : Secret Code
     *
     * Objective
     * In this stage, your program should generate a pseudo-random number of a
     * given length with unique digits and print it. If the length is greater
     * than 10, the program should print a message containing the word Error.
     * The secret code may contain any digits from 0 to 9 but only once.
     * The secret code shouldn't start with a digit 0: for the first digit of
     * the secret code, use digits from 1 to 9.
     */

    // Variables
    static String nanoTime = genNewNano();
    static int nanoTimeLength = nanoTime.length();
    static int currentCodeSize = 0;
    static int pointerPos = 0; // Pointer in nanoTime String
    static StringBuilder secretCode = new StringBuilder();

    public static void main() {
        Print.title("Project: Bulls and Cows - Stage 3: Secret Code");

        Scanner scanner = new Scanner(System.in);
        int codeSize = scanner.nextInt();
        if (codeSize > 10 || codeSize < 1) {
            System.out.printf(
                    "Error: can't generate a secret number with a " +
                    "length of %d because there aren't enough unique digits.",
                    codeSize);
        } else {
            while (currentCodeSize < codeSize) {
                secretCode.append(getDigit());
                System.out.println(secretCode);
                System.out.println("One more digit.");
                currentCodeSize++;
            }
        }

        Print.subtitle("End of stage 3", '*', (byte) 80);
    }

    public static String genNewNano() {
        StringBuilder sb1 = new StringBuilder();
        sb1.append(System.nanoTime());
        sb1.reverse();
        System.out.println(sb1);
        return sb1.toString();
    }

    public static String getDigit() {

        if (currentCodeSize == 0) {
            // First digit cannot be a 0
            while (nanoTime.charAt(pointerPos) == '0') {
                pointerPos++;
            }
        }

        pointerPos++;

        if (pointerPos >= nanoTimeLength) {
            nanoTime = genNewNano();
        }

        return String.valueOf(nanoTime.charAt(pointerPos));
    }
}
