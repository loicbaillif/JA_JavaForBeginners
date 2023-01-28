package com.loicbaillif.amazingNumbers;

import com.loicbaillif.tools.Print;

public class Stage7 {
    /* https://hyperskill.org/projects/184/stages/937/implement
     *
     * Stage 7: Jumping Numbers
     */

    // Variables
    static String farewell = "Thanks for using Amazing Numbers, goodbye!";
    static String instructions = """
            Welcome to Amazing Numbers!
                        
            Supported requests:
            - enter a natural number to know its properties;
            - enter two natural numbers to obtain the properties of the list:
              * the first parameter represents a starting number;
              * the second parameter shows how many consecutive numbers are to be processed;
            - two natural numbers and properties to search for;
            - separate the parameters with one space;
            - enter 0 to exit.
            """;


    public static void main() {
        Print.subtitle("Stage 7 : Jumping Numbers", '*', (byte) 80);

        // Variables

        System.out.println(instructions);


        System.out.println(farewell);

        Print.subtitle("End of Stage 7", '*', (byte) 80);
    }
}
