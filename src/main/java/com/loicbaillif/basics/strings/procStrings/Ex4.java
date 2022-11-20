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

    final static String vowels = "aeiouyAEIOUY";

    public static void main() {
        Print.title("Processing Strings - Exercise: Euphonious word");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (userInput.length() > 2) {
            int consecutiveSibling = 1;
            int result = 0;
            char previousChar = userInput.charAt(0);
            char currentChar;



            System.out.println(result);
        } else {
            System.out.println(0);
        }


        Print.subtitle("End of exercise");
    }

    public static boolean isVowel(char letter) {
        return vowels.indexOf(letter) >= 0;
    }
}
