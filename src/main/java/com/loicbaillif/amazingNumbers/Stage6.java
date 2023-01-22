package com.loicbaillif.amazingNumbers;

import com.loicbaillif.tools.Print;

public class Stage6 {
    /* https://hyperskill.org/projects/184/stages/936/implement
     *
     * Stage 6 : Sunny and Square Numbers
     */

    // Static Variables
    static String instructions = """
            Welcome to Amazing Numbers!
            
            Supported requests:
            - enter a natural number to know its properties;
            - enter two natural numbers to obtain the properties of the list:
              * the first parameter represents a starting number;
              * the second parameter shows how many consecutive \
            numbers are to be printed;
            - two natural numbers and a property to search for;
            - two natural numbers and two properties to search for;
            - separate the parameters with one space;
            - enter 0 to exit.
            """;
    static String askRequest = "Enter a request:";
    static String errorEmpty = "Error: User input cannot be empty.";
    static String errorInvalidProperty = """
    Error: the property [%s] is wrong.
    Available properties: ["BUZZ", "DUCK", "EVEN", "GAPFUL", \
    "ODD", "PALINDROMIC", "SPY", "SQUARE", "SUNNY"]
    """;
    static String errorLen = "Error: The second parameter should be " +
            "a natural number";
    static String errorNotNatural = "Error: The first parameter should be a " +
            "natural number or zero";
    static String errorNbArgs = "Error: The program needs 1 to 3 arguments";
    static String farewell = "Thanks for using Amazing Numbers, goodbye!";
    static String numberStatus = """
            Properties of %d
                       even: %b
                        odd: %b
                       buzz: %b
                       duck: %b
                palindromic: %b
                     gapful: %b
                        spy: %b
                     square: %b
                      sunny: %b
            """;
    static String[] listProperties =
            {"BUZZ", "DUCK", "EVEN", "GAPFUL", "ODD", "PALINDROMIC", "SPY",
            "SQUARE", "SUNNY"};
    static ProjectNumber projectNumber = new ProjectNumber(1);

    public static void main() {
        Print.subtitle("Stage 6 : Sunny and Square Numbers", '*', (byte) 80);



        Print.subtitle("End of Stage 6", '*', (byte) 80);
    }
}
