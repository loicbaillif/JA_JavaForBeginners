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
    static String numberStatus = """
            Properties of %d
                even: %b
                 odd: %b
                buzz: %b
            """;

    public static void main() {
        Print.subtitle("Stage 3 - Palindromic Numbers", '*', (byte) 80);

        System.out.println(welcome);
        ProjectNumber projectNumber = new ProjectNumber(9223372036854775807L);

        // TEST PHASE
        long[] testValues = {11L, 234L, 31L, 400L, 56L, 71L, 787L, 6789L, 66L,
                9223372036854775807L};
        for (long testValue : testValues) {
            projectNumber = new ProjectNumber(testValue);
            System.out.printf(numberStatus,
                    projectNumber.numberValue,
                    projectNumber.isEven(),
                    projectNumber.isOdd(),
                    projectNumber.isBuzz());
        }
        // END TEST

        /*
        System.out.printf(numberStatus,
                projectNumber.numberValue,
                projectNumber.isEven(),
                projectNumber.isOdd(),
                projectNumber.isBuzz());

         */

        Print.subtitle("End of Stage 3", '*', (byte) 80);
    }
}
