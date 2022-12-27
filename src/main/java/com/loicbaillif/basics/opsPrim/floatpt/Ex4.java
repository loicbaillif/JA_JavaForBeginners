package com.loicbaillif.basics.opsPrim.floatpt;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex4 {
    /* https://hyperskill.org/learn/step/2186
     *
     * *** Exponential Expression ***
     *
     * Write a program which reads a double value x and evaluates the result
     * of x^3 + x^2 + x + 1
     */
    public static void main() {
        Print.title("Floating - Exercise: Exponential Expression");

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(((x + 1) * x + 1) * x + 1); // Horner's method

        Print.subtitle("End of exercise");
    }
}
