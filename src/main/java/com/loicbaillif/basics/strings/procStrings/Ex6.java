package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex6 {
    /* https://hyperskill.org/learn/step/2288
     *
     * Write a program that finds the frequency of occurrences of a substring
     * in a given string. Substrings cannot overlap: for example, the string
     * ababa contains only one substring aba.
     *
     * Input data format:
     *      The first input line contains a string, the second one contains
     *      a substring.
     */

    public static void main() {
        Print.title("Processing Strings - Exercise: Number of occurrences");

        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        String userSubstring = scanner.nextLine();

        Print.subtitle("End of exercise");
    }
}
