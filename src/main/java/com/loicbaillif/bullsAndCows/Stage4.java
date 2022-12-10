package com.loicbaillif.bullsAndCows;

import com.loicbaillif.tools.Print;

public class Stage4 {
    /* https://hyperskill.org/projects/53/stages/290/implement
     *
     * Stage 4/7 : Game time!
     *
     * In this stage, you should combine all the previous parts into a simple
     * playable version of the "Bulls and Cows" game. First, prompt the player
     * to input the length of the secret code. The length will determine the
     * difficulty level for the current game session. The program should
     * generate a secret code of the given length. Remember that it should
     * consist of unique numbers.
     *
     * Then, the game starts and the program prompts the player to guess
     * the code. When the player inputs a number, the program should grade it
     * in bulls and cows. The game goes on until the code is guessed, that is,
     * until the number of bulls is equal to the number of digits in the code.
     * When the game ends, the program should finish its execution.
     */

    public static void main() {
        Print.title("Stage 4: Game Time", '+');



        Print.subtitle("End of Stage 4", '+', (byte) 80);
    }
}
