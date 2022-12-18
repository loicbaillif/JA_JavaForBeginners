package com.loicbaillif.addInst.ess.stand.math;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex2 {
    /* https://hyperskill.org/learn/step/2240
     *
     * ***** Heron's Formula *****
     *
     * Many years ago when Paul went to school, he did not like the Heron's
     * formula to calculate the area of a triangle, because he considered it
     * very complex. Once he decided to help all school students and write
     * and distribute a program calculating the area of a triangle by its
     * three sides.
     *
     * However, there was a problem: as Paul did not like the formula,
     * he did not memorize it. Help him finish this act of kindness and write
     * the program calculating the area of a triangle with the known length
     * of its sides, in accordance with Heron's formula:
     *      S = sqrt{p(p-a)(p-b)(p-c)}
     *
     * where
     *      p = (a + b + c) / 2
     *
     * In the input, the program has integers, and the output should be
     * a real number corresponding to the area of the triangle.
     */

    public static void main() {
        Print.title("Maths library - Exercise: Heron's formula");

        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();


        Print.subtitle("End of exercise");
    }
}
