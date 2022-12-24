package com.loicbaillif.addInst.ess.stand.random;

import com.loicbaillif.tools.Print;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    /* https://hyperskill.org/learn/step/4939
     *
     * Generate random numbers
     *
     * You are given three numbers: n , a and b.
     *
     * Your task is to output the sum of the first n random numbers in a range
     * from a to b inclusively.
     * The seed of the generator should be set as a + b.
     *
     * The input contains numbers in a single line in the following order:
     *      n, a, b.
     */

    public static void main() {
        Print.title("Random - Exercise: Generate random numbers");

        Scanner scanner = new Scanner(System.in);
        int nInput = scanner.nextInt();
        int aInput = scanner.nextInt();
        int bInput = scanner.nextInt();
        int sum = 0;

        Random r1 = new Random(aInput + bInput);
        while (nInput > 0) {
            sum += r1.nextInt(bInput - aInput + 1) + aInput;
            nInput--;
        }

        System.out.println(sum);

        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}
