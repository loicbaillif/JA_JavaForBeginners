package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex14 {
    /* https://hyperskill.org/learn/step/2282
     *
     *  *** The longest word ***
     *
     * In the given string find the first longest word and output it.
     *
     * Input data
     *      Given a string in a single line. Words in the string
     *      are separated by a single space.
     *
     * Output data
     *      Output the longest word. If there are several such words,
     *      you should output the one, which occurs earlier.
     */

    public static void main() {
        Print.title("Processing Strings - Exercise: The longest word");

        Scanner scanner = new Scanner(System.in);
        String[] inputWords = scanner.nextLine().split(" ");
        String longestWord = inputWords[0];
        int longestWordLength = longestWord.length();

        for (String word : inputWords) {
            if (word.length() > longestWordLength) {
                longestWord = word;
                longestWordLength = word.length();
            }
        }

        System.out.println(longestWord);

        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}
