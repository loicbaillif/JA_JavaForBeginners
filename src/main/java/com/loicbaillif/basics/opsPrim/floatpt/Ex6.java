package com.loicbaillif.basics.opsPrim.floatpt;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex6 {
    /* https://hyperskill.org/learn/step/2703
     *
     * ***** Difference between two doubles *****
     *
     * Write a program that reads two double values and prints
     * the difference between the second and the first one.
     */
    public static void main() {
        Print.title("Floating - Exercise: Difference between two doubles");

        Scanner scanner = new Scanner(System.in);
        double aInput = scanner.nextDouble();
        double bInput = scanner.nextDouble();

        Print.subtitle("End of exercise");
    }
}
