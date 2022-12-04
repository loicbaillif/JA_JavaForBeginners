package com.loicbaillif.bullsAndCows;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Stage3 {
    /* https://hyperskill.org/projects/53/stages/289/
     *
     * Stage 3 / 7 : Secret Code
     *
     * Objective
     * In this stage, your program should generate a pseudo-random number of a
     * given length with unique digits and print it. If the length is greater
     * than 10, the program should print a message containing the word Error.
     * The secret code may contain any digits from 0 to 9 but only once.
     * The secret code shouldn't start with a digit 0: for the first digit of
     * the secret code, use digits from 1 to 9.
     */

    public static void main() {
        Print.title("Project: Bulls and Cows - Stage 3: Secret Code");

        Scanner scanner = new Scanner(System.in);
        int codeSize = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(System.nanoTime());


        for (int i = 0; i < 10; i++) {
            System.out.printf("Run #%d: nanoTime() = %n\t", i);
            System.out.println(System.nanoTime());
        }

        Print.subtitle("End of stage 3", '*', (byte) 80);
    }
}
