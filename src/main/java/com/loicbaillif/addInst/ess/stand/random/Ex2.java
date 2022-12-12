package com.loicbaillif.addInst.ess.stand.random;

import com.loicbaillif.tools.Print;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    /* https://hyperskill.org/learn/step/4941
     *
     * Gaussian random numbers
     *
     * For the given numbers K, N, and M find the first seed that is greater
     * than or equal to K where each of N Gaussian numbers is less than
     * or equal to M.
     *
     * The input contains numbers K, N, M in a single line.
     *
     * You should output the seed.
     */

    public static void main() {
        Print.title("Random - Exercise: Gaussian random numbers");

        Scanner scanner = new Scanner(System.in);
        int kInput = scanner.nextInt();
        int nInput = scanner.nextInt();
        int mInput = scanner.nextInt();
        boolean seedFound = false;

        do {
            Random random = new Random(kInput);

            for (int i = kInput - 1; i <= nInput; i++) {
                if (random.nextGaussian() > mInput) {
                    break;
                }
                if (i == nInput) {
                    seedFound = true;
                }
            }

            kInput++; // Very important to avoid infinite loop
        } while (!seedFound);

        System.out.println(kInput);

        Print.subtitle("End of exercise", '*', (byte) 80);
    }
}
