package com.loicbaillif.basics.strings.procStrings;

import com.loicbaillif.tools.Print;

import java.util.Objects;
import java.util.Scanner;

public class Ex8 {
    /* https://hyperskill.org/learn/step/2291
     *
     *  *** The percentage of G and C characters ***
     * GC-content is an important feature of the genome sequences and is
     * defined as the percentage ratio of the sum of all guanines and
     * cytosines to the overall number of nucleic bases in the genome sequence.
     *
     * Write a program, which calculates the percentage of
     * G characters (guanine) and C characters (cytosine) in the entered
     * string. Your program should be case independent.
     *
     * *** Sample Input:
     *      acggtgttat
     *
     * *** Sample Output:
     *      40.0
     */

    public static void main() {
        Print.title("Processing Strings - Exercise: Percentage of C & G");

        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine().toLowerCase();
        char cytosine = 'c';
        char guanine = 'g';
        int sequenceLength = sequence.length();
        int gcCount = 0;



        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}
