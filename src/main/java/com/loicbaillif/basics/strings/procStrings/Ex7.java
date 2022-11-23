package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex7 {
    /* https://hyperskill.org/learn/step/2293
     *
     * Write a program that reads a string s and an int n, and then moves the
     * first n characters of s to the end of the string. The program must
     * output the changed string. If n is greater than the length of the
     * string, it must output the string unchanged.
     */
    public static void main() {
        Print.title("Processing Strings - Exercise: Move the first N chars");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String userString = userInput.split(" ")[0];
        int userInt = Integer.parseInt(userInput.split(" ")[1]);
        int wordLength = userString.length();
        int n = userInt;
        while (n < wordLength) {
            System.out.print(userString.charAt(n++));
        }
        n = 0;
        while ((n < userInt) && (n < wordLength)) {
            System.out.print(userString.charAt(n++));
        }

        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}
