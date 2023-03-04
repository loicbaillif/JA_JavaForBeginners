package com.loicbaillif.addInst.ess.stand.math;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex4 {
    /* https://hyperskill.org/learn/daily/2236
     *
     * ***** Pow *****
     * You are given two floating-point numbers: a and b.
     * Calculate and output the value of the expression a^b
     * NOTE: use double variables for a and b.
     */
    public static void main() {
        Print.title("Maths library - Exercise: Pow");

        // Variables
        Scanner scanner = new Scanner(System.in);
        double aInput = scanner.nextDouble();
        double bInput = scanner.nextDouble();

        System.out.println(Math.pow(aInput, bInput));

        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}
