package com.loicbaillif.basics.opsPrim.floatpt;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex3 {
    /* https://hyperskill.org/learn/step/2705
     *
     * *** Evaluate an expression ***
     *
     * Write a program that reads four double values a, b, c, d
     * and then evaluates the following expression
     *      a * 10.5 + b * 4.4 + (c + d) / 2.2
     *
     * The program should output the result.
     */

    public static void main() {
        Print.title("Floating - Exercise: Evaluate an expression");

        Scanner scanner = new Scanner(System.in);
        double aInput = scanner.nextDouble();
        double bInput = scanner.nextDouble();
        double cInput = scanner.nextDouble();
        double dInput = scanner.nextDouble();

        final double formulaVar1 = 10.5;
        final double formulaVar2 = 4.4;
        final double formulaVar3 = 2.2;

        double result = aInput * formulaVar1 + bInput * formulaVar2
                + (cInput + dInput) / formulaVar3;
        System.out.println(result);

        Print.subtitle("End of exercise");
    }
}
