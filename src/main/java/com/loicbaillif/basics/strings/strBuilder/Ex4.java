package com.loicbaillif.basics.strings.strBuilder;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex4 {
    /* https://hyperskill.org/learn/daily/23738
     *
     * Implement a method that takes a String message as an argument. The
     * method translates all letters having an even index to uppercase
     * (index 0 is considered even) and returns the result.
     *
     * It's guaranteed that input strings will not be empty.
     */

    public static void main() {
        Print.title("StringBuilder - Exercise: Love of big letters");

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < sb1.length(); i += 2) {
            sb1.setCharAt(i, Character.toUpperCase(sb1.charAt(i)));
        }

        System.out.println(sb1);

        Print.subtitle("End of Exercise", '*', (byte) 80);
    }
}
