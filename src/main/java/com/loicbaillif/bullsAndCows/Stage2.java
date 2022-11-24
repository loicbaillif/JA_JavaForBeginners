package com.loicbaillif.bullsAndCows;

import com.loicbaillif.tools.Print;

import java.util.Objects;
import java.util.Scanner;

public class Stage2 {
    /* https://hyperskill.org/projects/53/stages/288/implement
     * Bulls and Cows project - Stage 2 / 7
     *
     */

    public static void main() {
        Print.title("Project: Bulls and Cows - Stage 2: Grader");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String secret = "9305"; // To work with, will be random in final
        String formatS = "Number %s has %d bull(s) and %d cow(s).%n";

        // Looking for bulls, then for cows
        byte[] result = bullsCows(userInput, secret);
        System.out.printf(formatS, userInput, result[0], result[1]);

        String[] testArray = {"9305", "3059", "3590", "5930", "5039",
        "9306", "9385", "9505", "1305", "9350", "9035", "5309", "3905",
        "1293", "5012", "3512", "5129", "1246", "7184", "4862", "2718",
        "1111", "9999", "9955"};

        for (String proposal: testArray) {
            result = bullsCows(proposal, secret);
            System.out.printf(formatS, proposal, result[0], result[1]);
        }

        Print.subtitle("End of stage 2", '*', (byte) 80);
    }


    public static byte[] bullsCows(String proposal, String solution) {
        byte nbBulls = 0;
        byte nbCows = 0;

        for (byte i = 0; i < proposal.length(); i++) {
            if (Objects.equals(proposal.charAt(i), solution.charAt(i))) {
                nbBulls++;
            } else if (solution.indexOf(proposal.charAt(i)) != -1) {
                nbCows++;
            }
        }

        return new byte[]{nbBulls, nbCows};
    }
}
