package com.loicbaillif.addInst.ess.stand.random;

import com.loicbaillif.tools.Print;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    /* https://hyperskill.org/learn/step/4940
     *
     * Your job is to find the seed between A and B (both inclusive) that
     * produces N pseudorandom numbers from 0 (inclusive) to K (exclusive).
     * It should also have the maximum of these N numbers to be the minimum
     * among all maximums of other seeds in this range.
     */
    public static void main() {
        Print.title("Random - Exercise: Find the seed");

        Scanner scanner = new Scanner(System.in);
        int aInput = scanner.nextInt();
        int bInput = scanner.nextInt();
        int nInput = scanner.nextInt();
        int kInput = scanner.nextInt();
        int answerSeed = aInput;
        int answerLowerMax = kInput;
        int maxForSeed = 0;

        for (int i = aInput; i <= bInput; i++) {
            Random r1 = new Random(i);

            for (int j = 0; j < nInput; j++) {
                int temp = r1.nextInt(kInput);
                if (temp > maxForSeed) {
                    maxForSeed = temp;
                }
            }

            if (maxForSeed < answerLowerMax) {
                answerLowerMax = maxForSeed;
                answerSeed = i;
            }

            maxForSeed = 0;
        }

        System.out.printf("%d%n%d%n", answerSeed, answerLowerMax);


        Print.subtitle("End of exercise");
    }
}
