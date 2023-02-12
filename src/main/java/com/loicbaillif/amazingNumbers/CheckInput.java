package com.loicbaillif.amazingNumbers;

import java.util.ArrayList;
import java.util.Objects;

class CheckInput {
    // Variables
    static String errorIncompatibleProperties = """
            The request contains mutually exclusive properties: [%s, %s]
            There are no numbers with these properties.
            """;
    static String errorInvalidProperties = """
            Error: The properties %s are wrong.
            Available properties: ["BUZZ", "DUCK", "EVEN", "GAPFUL", \
            "JUMPING", "ODD", "PALINDROMIC", "SPY", "SQUARE", "SUNNY"]
            """;
    static String errorInvalidProperty = """
            Error: the property %s is wrong.
            Available properties: ["BUZZ", "DUCK", "EVEN", "GAPFUL", \
            "JUMPING", "ODD", "PALINDROMIC", "SPY", "SQUARE", "SUNNY"]
            """;
    static String errorLen = "Error: The second parameter should be " +
            "a natural number";
    static String errorNotNatural = "Error: The first parameter should be a " +
            "natural number or zero";
    static String[] listProperties =
            {"BUZZ", "DUCK", "EVEN", "GAPFUL", "JUMPING", "ODD",
                    "PALINDROMIC", "SPY", "SQUARE", "SUNNY"};


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


    static boolean verifyProperties(
            String[] properties,
            ArrayList<String> errorList,
            ArrayList<String> excludedList,
            ArrayList<String> validList) {
        // Returns String[] after checking properties element are valid, i.e.
        //  - in the given list
        //  - No incompatibility pair
        // Will also remove duplicated properties

        // Variables
        boolean excludedProperty;
        boolean errorProperty = false;
        boolean validProperty;

        // Processing
        for (String property : properties) {
            // Process properties one by one:
            // 1. Trim the '-' if any.
            excludedProperty = (property.charAt(0) == '-');
            if (excludedProperty) property = property.substring(1);

            // 2. Check if property is valid
            validProperty = isValidProperty(property);

            // 3. Place it in the appropriate ArrayList
            if (!validProperty && !errorList.contains(property)) {
                // Not valid, not in error list
                errorList.add(property);
                errorProperty = true;
            }
            if (validProperty) {
                if (excludedProperty && !excludedList.contains(property)) {
                    // Valid, excluded (-), not in excluded list
                    excludedList.add(property);
                }
                if (!excludedProperty && !validList.contains(property)) {
                    // Valid, included, not in valid list
                    validList.add(property);
                }
            }
        }
        showInvalidProperties(errorList);
        if (errorProperty) return false;

        // Step 3: compatible properties?
        return (verifyPropCompat(validList) && verifyPropCompat(excludedList));
    }


    private static boolean verifyPropCompat(ArrayList<String> properties) {
        // Returns true if and only if there is no
        // mutually exclusive pair of properties
        if (properties.contains("EVEN") && properties.contains("ODD")) {
            System.out.printf(errorIncompatibleProperties, "EVEN", "ODD");
            return false;
        }

        if (properties.contains("DUCK") && properties.contains("SPY")) {
            System.out.printf(errorIncompatibleProperties, "DUCK", "SPY");
            return false;
        }

        if (properties.contains("SUNNY") && properties.contains("SQUARE")) {
            System.out.printf(errorIncompatibleProperties, "SUNNY", "SQUARE");
            return false;
        }

        if (properties.contains("HAPPY") && properties.contains("SAD")) {
            System.out.printf(errorIncompatibleProperties, "HAPPY", "SAD");
            return false;
        }

        return true;
    }


    private static boolean verifyPropCompat(
            ArrayList<String> properties,
            boolean exclusionList) {
        // Variables
        String exclusionMark = exclusionList? "-": "";

        // Processing
        if (properties.contains("EVEN") && properties.contains("ODD")) {
            System.out.printf(errorIncompatibleProperties,
                    exclusionMark, "EVEN", exclusionMark, "ODD");
            return false;
        }

        return true;
    }
}
