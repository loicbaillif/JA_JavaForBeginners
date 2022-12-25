package com.loicbaillif.addInst.ess.stand.math;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex3 {
    /* https://hyperskill.org/learn/step/2237
     *
     * ***** Quadratic equation *****
     *
     * You are given real numbers a, b and c, where a ≠ 0.
     * Solve the quadratic equation ax^2 + bx + c = 0 and output all
     * of its roots.
     *
     * It is guaranteed that the equation always has two roots.
     * Output the results roots in ascending order. Do not round or format
     * them, the testing system does it automatically.
     */

    public static void main() {
        Print.title("Maths library - Exercise: Quadratic equation");

        Scanner scanner = new Scanner(System.in);
        double aInput = scanner.nextDouble();
        double bInput = scanner.nextDouble();
        double cInput = scanner.nextDouble();

        Print.subtitle("End of exercise");
    }
}
