package com.loicbaillif.basics.strings.strBuilder;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex2 {
    /* https://hyperskill.org/learn/step/3813
     *
     * Concat all Strings without digits
     *
     * Implement a method to concatenate all strings from the given array to a
     * single long string. You must skip all digits inside the input strings.
     *
     * Use StringBuilder to solve the problem, because the input array
     * can contain a huge number of strings.
     */

    public static void main() {
        Print.title("StringBuilder - Exercise: Concat all Strings ...");

        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);

        Print.subtitle("End of exercise");
    }

    public static String concatenateStringsWithoutDigits(String[] strings) {
        // write your code with StringBuilder here
        StringBuilder sb = new StringBuilder();
        int wordLength;
        int codeSpace = 32;
        int codeZero = 48;
        int codeNine = 57;

        for (String word: strings) {
            wordLength = word.length();
            for (int i = 0; i < wordLength; i++) {
                int letterCode = word.charAt(i);
                if (letterCode != codeSpace
                        && (letterCode < codeZero || letterCode > codeNine)) {
                    sb.append((char) letterCode);
                }
            }
        }
        return sb.toString();
    }
}
