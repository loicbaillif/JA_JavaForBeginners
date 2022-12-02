package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex13 {
    /*
     *
     * *** Palindrome ***
     *
     * Write a program that reads a string and checks whether it is
     * a palindrome, i.e. it reads the same both left-to-right and
     * right-to-left.
     *
     * The program must output “yes” if the string is a palindrome
     * and “no” otherwise.
     */

    public static void main() {
        Print.title("Processing Strings - Exercise: Palindrome");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        boolean isPalindrome = true;

        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}
