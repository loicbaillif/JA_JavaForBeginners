package com.loicbaillif.amazingNumbers;

import java.util.ArrayList;
import java.util.Objects;

class CheckInput {
    // Variables
    static String errorInvalidProperties = """
            Error: The properties %s are wrong.
            Available properties: ["BUZZ", "DUCK", "EVEN", "GAPFUL", \
            "ODD", "PALINDROMIC", "SPY", "SQUARE", "SUNNY"]
            """;
    static String errorInvalidProperty = """
            Error: the property %s is wrong.
            Available properties: ["BUZZ", "DUCK", "EVEN", "GAPFUL", \
            "ODD", "PALINDROMIC", "SPY", "SQUARE", "SUNNY"]
            """;
    static String errorLen = "Error: The second parameter should be " +
            "a natural number";
    static String errorNotNatural = "Error: The first parameter should be a " +
            "natural number or zero";
    static String[] listProperties =
            {"BUZZ", "DUCK", "EVEN", "GAPFUL", "ODD", "PALINDROMIC", "SPY",
                    "SQUARE", "SUNNY"};


    // Methods
    private static boolean isValidProperty(String property) {
        for (String listProperty : listProperties) {
            if (Objects.equals(listProperty, property)) {
                return true;
            }
        }
        return false;
    }


    private static void showInvalidProperties(ArrayList<String> properties) {
        if (properties.size() == 1) {
            System.out.printf(errorInvalidProperty, properties);
            return;
        }
        if (properties.size() > 1) {
            System.out.printf(errorInvalidProperties, properties);
        }
    }


    static long strToLong(String input, String errorMessage, long minValue) {
        // minValue is excluded
        long inputLong;
        try {
            inputLong = Long.parseLong(input);
        } catch (NumberFormatException e) {
            inputLong = minValue;
        }

        if (minValue != Long.MIN_VALUE && inputLong <= minValue) {
            System.out.println(errorMessage);
            inputLong = minValue;
        }

        return inputLong;
    }


    static long verifyFirstValue(String userInput) {
        return strToLong(
                userInput,
                errorNotNatural,
                -1L
        );
    }


    static int verifyNbElements(String userInput) {
        return (int) CheckInput.strToLong(userInput, errorLen, 0L);
    }


    static String[] verifyProperties(String[] properties) {
        // Returns String[] after checking properties element are valid, i.e.
        //  - in the given list
        //  - No incompatibility pair
        // Will also remove duplicated properties

        // Variables
        ArrayList<String> validList = new ArrayList<>();
        ArrayList<String> rejectedList = new ArrayList<>();

        for (int i = 0; i < properties.length; i++) {
            // Verify properties one by one

            // Step 1: valid?
            if (!isValidProperty(properties[i])) {
                if (!rejectedList.contains(properties[i])) {
                    rejectedList.add(properties[i]);
                }
            } else if (!validList.contains(properties[i])) {
                // Step 2: duplicated?
                validList.add(properties[i]);
            }

            // Step 3:
        }

        showInvalidProperties(rejectedList);

        return validList.toArray(new String[validList.size()]);
    }


    private static boolean verifyPropertyCompat(String prop1, String prop2) {
        // Returns true if and only if prop1 and prop2 are compatible
        if (Objects.equals(prop1, "EVEN")) {
            return !Objects.equals(prop2, "ODD");
        }
        if (Objects.equals(prop1, "ODD")) {
            return !Objects.equals(prop2, "EVEN");
        }
        if (Objects.equals(prop1, "DUCK")) {
            return !Objects.equals(prop2, "SPY");
        }
        if (Objects.equals(prop1, "SPY")) {
            return !Objects.equals(prop2, "DUCK");
        }
        if (Objects.equals(prop1, "SUNNY")) {
            return !Objects.equals(prop2, "SQUARE");
        }
        if (Objects.equals(prop1, "SQUARE")) {
            return !Objects.equals(prop2, "SUNNY");
        }
        return true;
    }
}
