package com.loicbaillif.basics.opsPrim.floatpt;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex7 {
    /* https://hyperskill.org/learn/step/2704
     *
     * ***** Find X *****
     *
     * Write a program that reads three double values a, b, c,
     * and then solves the simple equation:
     *      a * x + b = c
     *
     * The program should output the value of x.
     * It's guaranteed that a is not 0.
     */
    public static void main() {
        Print.title("Floating - Exercise: Find X");

        Scanner scanner = new Scanner(System.in);
        double aInput = scanner.nextDouble();
        double bInput = scanner.nextDouble();
        double cInput = scanner.nextDouble();
        double xOutput;

        // a * x + b = c  <=>  x = (c - b) / a
        xOutput = (cInput - bInput) / aInput;

        Print.subtitle("End of exercise");
    }
}
