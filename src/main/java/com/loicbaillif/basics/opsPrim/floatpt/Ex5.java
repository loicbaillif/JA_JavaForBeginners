package com.loicbaillif.basics.opsPrim.floatpt;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex5 {
    /* https://hyperskill.org/learn/step/5014
     *
     * ***** Liquid Pressure *****
     *
     * Write a program that reads the density of a liquid ρ and the height
     * of a column h, and calculates the liquid pressure p.
     *
     * . We suppose the gravitational acceleration g is 9.8 m/s² (Earth).
     * . Do not format the result.
     *
     * Note:
     * The pressure exerted by liquid in liquid columns of constant density
     * or by a substance at a certain depth is represented by the following
     * formula:
     *      p = ρgh
     */
    public static void main() {
        Print.title("Floating - Exercise: Liquid Pressure");

        Scanner scanner = new Scanner(System.in);
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();
        final double gravity = 9.8;
        double pressure = density * gravity * height;

        Print.subtitle("End of exercise");
    }
}
