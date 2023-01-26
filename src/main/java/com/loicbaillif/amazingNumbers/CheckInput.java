package com.loicbaillif.amazingNumbers;

import java.util.Objects;

class CheckInput {
    // Variables
    static String errorInvalidProperties = """
            Error: The properties [%s, %s] are wrong.
            Available properties: ["BUZZ", "DUCK", "EVEN", "GAPFUL", \
            "ODD", "PALINDROMIC", "SPY", "SQUARE", "SUNNY"]
            """;
    static String errorInvalidProperty = """
            Error: the property [%s] is wrong.
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


    private static boolean isValidProperty(String property) {
        boolean result = false;
        for (String listProperty : listProperties) {
            if (Objects.equals(listProperty, property)) {
                result = true;
                break;
            }
        }

        return result;
    }


    private static long verifyFirstValue(String userInput) {
        return strToLong(
                userInput,
                errorNotNatural,
                -1L
        );
    }


    private static int verifyNbElements(String userInput) {
        return (int) CheckInput.strToLong(userInput, errorLen, 0L);
    }


    private static boolean verifyProperties(String prop1, String prop2) {
        // Returns true if and only if prop1 and prop2 are valid properties
        // i.e. in the given list
        if (isValidProperty(prop1) && isValidProperty(prop2)) {
            return true;
        } else if (!isValidProperty(prop1) && !isValidProperty(prop2)) {
            System.out.printf(errorInvalidProperties, prop1, prop2);
        } else if (!isValidProperty(prop1)) {
            System.out.printf(errorInvalidProperty, prop1);
        } else if (!isValidProperty(prop2)) {
            System.out.printf(errorInvalidProperty, prop2);
        }

        return false;
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
