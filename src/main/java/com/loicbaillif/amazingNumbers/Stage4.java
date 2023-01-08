package com.loicbaillif.amazingNumbers;

import com.loicbaillif.tools.Print;

public class Stage4 {
    /* https://hyperskill.org/projects/184/stages/934/implement
     *
     * Amazing Numbers - Stage 4 : Gapful number
     */

    // Static Variables
    static String instructions = """
            Supported requests:
            - enter a natural number to know its properties;
            - enter two natural numbers to obtain the properties of the list:
              * the first parameter represents a starting number;
              * the second parameter shows how many consecutive \
            numbers are to be printed;
            - separate the parameters with one space;
            - enter 0 to exit.
            """;
    public static void main() {
        Print.subtitle("Stage 4 : Gapful Number", '*', (byte) 80);

        System.out.println(instructions);

        Print.subtitle("End of Stage 4", '*', (byte) 80);
    }
}
