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
        String secretCode = "9305"; // To work with, will be random in final
        byte nbBulls = 0;
        byte nbCows = 0;

        // Looking for bulls
        for (byte i = 0; i < userInput.length(); i++) {
            System.out.printf("Loop %d;%n", i);
            if (Objects.equals(userInput.charAt(i), secretCode.charAt(i))) {
                nbBulls++;
            }
        }




        Print.subtitle("End of stage 2", '*', (byte) 80);
    }
}
