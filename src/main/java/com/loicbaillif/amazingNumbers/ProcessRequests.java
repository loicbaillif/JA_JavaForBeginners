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
        // Check first value
        long firstValue = CheckInput.verifyFirstValue(userInput[0]);
        if (firstValue == -1) return;

        // Check number of elements
        int nbElements = CheckInput.verifyNbElements(userInput[1]);
        if (nbElements == 0) return;

        // Treat request only if previous checks successful
        for (int i = 0; i < nbElements; i++) {
            projectNumber.setNumberValue(firstValue + i);
            projectNumber.setProperties();
            projectNumber.giveShortStatus();
        }

    }


    static void process3MoreInputs(String[] userInput) {
        System.out.println("3 inputs or more to process"); // DEBUG

        // Variables
        int foundElements = 0;
        int nbProperties = userInput.length - 2;
        String[] seekedProperties = new String[nbProperties];

        // Check first value
        long firstValue = CheckInput.verifyFirstValue(userInput[0]);
        if (firstValue == -1) return;

        // Check number of elements
        int nbElements = CheckInput.verifyNbElements(userInput[1]);
        if (nbElements == 0) return;

        // Populate seekedProperties
        for (int i = 0; i < nbProperties; i++) {
            seekedProperties[i] = userInput[i + 2].toUpperCase();
        }

        // Check seekedProperties
        String[] properties = CheckInput.verifyProperties(seekedProperties);
    }
}
