package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex4 {
    /* https://hyperskill.org/learn/step/3791
     * All the letters of the English alphabet are divided into
     * vowels and consonants.
     *      The vowels are: a, e, i, o, u, y.
     *      The remaining letters are consonants.
     *
     * A word is considered euphonious (pleasant-sounding) if it doesn't
     * have three or more vowels or consonants in a row. Otherwise, it is
     * considered discordant (harsh-sounding).
     *
     * Your task is to create euphonious words from discordant. You can insert
     * any letters inside the word. You should output the minimum number of
     * characters needed to create a euphonious word from a given word.
     */

    final static String VOWELS = "aeiouyAEIOUY";

    public static void main() {
        Print.title("Processing Strings - Exercise: Euphonious word");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (userInput.length() > 2) {
            int consecutiveSibling = 1;
            int result = 0;
            char previousChar = userInput.charAt(0);
            char currentChar;

            for (int i = 1; i < userInput.length(); i++) {
                currentChar = userInput.charAt(i);

                if (isVowel(currentChar) == isVowel(previousChar)) {
                    consecutiveSibling++;
                } else {
                    /*
                     * We check if number of consecutive vowels or consonants
                     * is high enough to need letters insertion, and how many
                     * Then we reset the counter to 1
                     */
                    result += (consecutiveSibling - 1) / 2;
                    consecutiveSibling = 1;
                }
                previousChar = currentChar;
            }

            // Final count, if a chain is on-going at the last char
            result += (consecutiveSibling - 1) / 2;

            System.out.println(result);
        } else {
            System.out.println(0);
        }

        Print.subtitle("End of exercise");
    }

    public static boolean isVowel(char letter) {
        return VOWELS.indexOf(letter) >= 0;
    }
}
