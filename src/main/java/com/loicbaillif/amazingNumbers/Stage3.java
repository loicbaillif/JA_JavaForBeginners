package com.loicbaillif.amazingNumbers;

import com.loicbaillif.tools.Print;

public class Stage3 {
    /* https://hyperskill.org/projects/184/stages/933/implement
     *
     * Stage 3 - Palindromic Numbers
     */

    // Static variables

    static String welcome = """
            Welcome to Amazing Numbers!
                
            Supported requests:
                - enter a natural number to know its properties;
                - enter 0 to exit.
            """;

    public static void main() {
        Print.subtitle("Stage 3 - Palindromic Numbers", '*', (byte) 80);

        System.out.println(welcome);
        ProjectNumber projectNumber = new ProjectNumber(9223372036854775807L);

        Print.subtitle("End of Stage 3", '*', (byte) 80);
    }
}
