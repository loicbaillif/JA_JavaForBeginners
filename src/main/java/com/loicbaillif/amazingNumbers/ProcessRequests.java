package com.loicbaillif.amazingNumbers;

import java.util.Objects;

public class ProcessRequests {
    // Static Variables
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
    static ProjectNumber projectNumber = new ProjectNumber(1);


    static boolean process1Input(String userInput) {
        System.out.println("1 input to process"); // DEBUG

        // Exit condition
        if (Objects.equals("0", userInput)) return true;

        // Variable
        long firstValue = CheckInput.verifyFirstValue(userInput);
        if (firstValue == -1) return false;

        projectNumber.setProperties();
        projectNumber.giveStatus(numberStatus);

        return false;
    }


    static void process2Inputs(String[] userInput) {
        System.out.println("2 inputs to process"); // DEBUG


    }


    static void process3MoreInputs(String[] userInput) {
        System.out.println("3 inputs or more to process");
    }
}
