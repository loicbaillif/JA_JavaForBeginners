package com.loicbaillif.chuckNorris;

import com.loicbaillif.tools.Print;

import java.util.Scanner;

public class Stage1 {
    /*
     * https://hyperskill.org/projects/293/stages/1536/implement
     *
     * Project Chuck Norris Cipher Encoder - Stage 1 : Analyze the words
     */
    public static void main() {
        Print.subtitle("Stage 1 - Analyze the words", '*', (byte) 80);

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            System.out.printf("%c ", userInput.charAt(i));
        }

        Print.subtitle("End of Stage 1", '*', (byte) 80);
    }
}
