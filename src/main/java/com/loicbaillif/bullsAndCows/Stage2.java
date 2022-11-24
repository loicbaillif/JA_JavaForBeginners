package com.loicbaillif.bullsAndCows;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Stage2 {
    /* https://hyperskill.org/projects/53/stages/288/implement
     * Bulls and Cows project - Stage 2 / 7
     *
     */

    public static void main() {
        Print.title("Project: Bulls and Cows - Stage 2: Grader");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int secretCode = 9305;
        byte nbBulls = 0;
        byte nbCows = 0;


        Print.subtitle("End of stage 2", '*', (byte) 80);
    }
}
