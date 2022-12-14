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
        double delta = bInput * bInput - 4 * aInput * cInput;
        double r1 = (-bInput - Math.sqrt(delta)) / (2 * aInput);
        double r2 = (-bInput + Math.sqrt(delta)) / (2 * aInput);
        System.out.print(Math.min(r1, r2) + " " + Math.max(r1, r2));

        Print.subtitle("End of exercise");
    }
}
