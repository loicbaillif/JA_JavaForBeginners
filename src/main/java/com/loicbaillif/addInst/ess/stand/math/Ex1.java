package com.loicbaillif.addInst.ess.stand.math;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Ex1 {
    /* https://hyperskill.org/learn/step/2240
     *
     * ***** The angle between two vectors *****
     *
     * You are given two 2D vectors. Find the angle (in degrees) between them.
     *
     * Input data format
     *      The first line contains two components of the first vector;
     *      the second line contains two components of the second vector.
     *      Components in one line are separated by space.
     *
     * Output data format
     *      One double value: an angle between two vectors. The result
     *      can have an error of less than 1e-8.
     */

    public static void main() {
        Print.title("Maths library - Exercise: The angle between vectors");

        Scanner scanner = new Scanner(System.in);
        // Vector v1 (v1x, v1y) - Vector v2 (v2x, v2y)
        int v1x = scanner.nextInt();
        int v1y = scanner.nextInt();
        int v2x = scanner.nextInt();
        int v2y = scanner.nextInt();


        Print.subtitle("End of exercise");
    }
}
