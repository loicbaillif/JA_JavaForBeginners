package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex2 {
    /* https://hyperskill.org/learn/step/2285
     *
     * Write a program that reads a string and outputs "true" only when the
     * letters of this string form a substring of the ordered
     * English alphabet, for example, "abc", "xy", "pqrst".
     *
     * Otherwise, it should print out "false".
     */
    public static void main() {
        Print.title("Processing Strings - Exercise: Piece of alphabet");

        String alphabet = "abcdefghijklmnopqrstuvwxyz ";
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] strArray1 = alphabet.split(userInput);
        System.out.println(strArray1.length > 1);

        Print.subtitle("End of exercise");
    }
}
