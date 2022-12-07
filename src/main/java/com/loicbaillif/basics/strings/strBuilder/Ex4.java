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

        StringBuilder sb1 = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        sb1.append(scanner.nextLine());

        Print.subtitle("End of Exercise", '*', (byte) 80);
    }
}
