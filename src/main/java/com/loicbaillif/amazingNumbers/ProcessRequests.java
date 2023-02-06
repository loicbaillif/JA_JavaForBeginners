package com.loicbaillif.amazingNumbers;

import java.util.Objects;

public class ProcessRequests {
    // Static Variables
    static String numberStatus = """
            Properties of %d
                       buzz: %b
                       duck: %b
                       even: %b
                     gapful: %b
                      happy: %b
                    jumping: %b
                        odd: %b
                palindromic: %b
                        sad: %b
                        spy: %b
                     square: %b
                      sunny: %b
            """;
    static ProjectNumber projectNumber = new ProjectNumber(1);


    private static boolean hasProperties(String[] properties) {
        for (String property: properties) {

            switch (property) {
                case "BUZZ" -> {
                    projectNumber.setBuzz();
                    if (!projectNumber.isBuzz()) return false;
                }
                case "DUCK" -> {
                    projectNumber.setDuck();
                    if (!projectNumber.isDuck()) return false;
                }
                case "EVEN" -> {
                    projectNumber.setEven();
                    if (!projectNumber.isEven()) return false;
                }
                case "GAPFUL" -> {
                    projectNumber.setGapful();
                    if (!projectNumber.isGapful()) return false;
                }
                case "JUMPING" -> {
                    projectNumber.setJumping();
                    if (!projectNumber.isJumping()) return false;
                }
                case "ODD" -> {
                    projectNumber.setOdd();
                    if (!projectNumber.isOdd()) return false;
                }
                case "PALINDROMIC" -> {
                    projectNumber.setPalindromic();
                    if (!projectNumber.isPalindromic()) return false;
                }
                case "SPY" -> {
                    projectNumber.setSpy();
                    if (!projectNumber.isSpy()) return false;
                }
                case "SQUARE" -> {
                    projectNumber.setSquare();
                    if (!projectNumber.isSquare()) return false;
                }
                case "SUNNY" -> {
                    projectNumber.setSunny();
                    if (!projectNumber.isSunny()) return false;
                }
                default -> {
                    return false; // unknown property
                }
            }

        }

        return true;
    }


    static boolean process1Input(String userInput) {
        // Exit condition
        if (Objects.equals("0", userInput)) return true;

        // Variable
        long firstValue = CheckInput.verifyFirstValue(userInput);
        if (firstValue == -1) return false;

        projectNumber.setNumberValue(firstValue);
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

        // Treat request only if previous checks successful
        if (Objects.equals("ERROR", properties[0])) return;

        while (foundElements < nbElements) {
            projectNumber.setNumberValue(firstValue++);
            if (hasProperties(properties)) {
                projectNumber.setProperties();
                projectNumber.giveShortStatus();
                foundElements++;
            }
        }



    }
}
